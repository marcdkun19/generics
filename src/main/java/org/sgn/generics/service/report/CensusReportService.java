package org.sgn.generics.service.report;

import java.util.List;

import org.sgn.generics.common.model.Census;
import org.sgn.generics.common.repository.ICensusRepository;
import org.sgn.generics.common.service.BaseService;
import org.sgn.generics.iservice.report.ICensusReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CensusReportService extends BaseService implements ICensusReportService {

	@Autowired
	private ICensusRepository censusRepository;
	
	public int getCount() {
		return censusRepository.getCount();
	}

	@Override
	public Census getCensus(Long serialId) {
		return censusRepository.findById(serialId).orElse(null);
	}

	@Override
	public List<Census> getByAreaGroup(String area, String grp) {
		return censusRepository.findByAreaGroup(area, grp);
	}
}