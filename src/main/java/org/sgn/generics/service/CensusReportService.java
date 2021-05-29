package org.sgn.generics.service;

import java.util.List;
import org.sgn.generics.iservice.ICensusReportService;
import org.sgn.generics.model.Census;
import org.sgn.generics.repository.ICensusRepository;
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