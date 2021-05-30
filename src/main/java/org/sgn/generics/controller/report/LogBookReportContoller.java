package org.sgn.generics.controller.report;

import java.util.List;
import org.sgn.generics.common.form.ListResponseEntity;
import org.sgn.generics.common.form.SingleResponseEntity;
import org.sgn.generics.common.model.Census;
import org.sgn.generics.iservice.report.ICensusReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogBookReportContoller {

	
	@Autowired
	private ICensusReportService iCensusService;

	@RequestMapping("/")
	public String index() {
		return "Hello World!" + iCensusService.getCount();
	}
	
	@RequestMapping(value="/record/{serialId}")
	public ResponseEntity<SingleResponseEntity<Census>> getCensus(@PathVariable(name = "serialId") Long serialId) {
		Census census = iCensusService.getCensus(serialId);
		
		SingleResponseEntity<Census> sre = new SingleResponseEntity<Census>().payload(census).status(HttpStatus.OK.value()).message(census == null ? "No Record found" : "Record Found");
		
		return ResponseEntity.ok(sre);
	}
	

	@RequestMapping(value="/record/ag/{area}/{grp}")
	public ResponseEntity<ListResponseEntity<Census>> getByAreaGroup(@PathVariable(name = "area") String area, @PathVariable(name = "grp") String grp) {
		List<Census> census = iCensusService.getByAreaGroup(area, grp);
		
		ListResponseEntity<Census> lre = new ListResponseEntity<Census>().payload(census).status(HttpStatus.OK.value()).message((census == null || census.isEmpty()) ? "No records found" : (census.size() + " records found"));
		
		return ResponseEntity.ok(lre);
	}
}