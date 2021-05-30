package org.sgn.generics.iservice.report;

import java.util.List;

import org.sgn.generics.common.iservice.IBaseService;
import org.sgn.generics.common.model.Census;

public interface ICensusReportService extends IBaseService {

	public int getCount();
	
	public Census getCensus(Long serialId);
	
	public List<Census> getByAreaGroup(String area, String grp);
}