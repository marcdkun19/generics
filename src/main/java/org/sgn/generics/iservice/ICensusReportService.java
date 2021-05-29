package org.sgn.generics.iservice;

import java.util.List;
import org.sgn.generics.model.Census;

public interface ICensusReportService extends IBaseService {

	public int getCount();
	
	public Census getCensus(Long serialId);
	
	public List<Census> getByAreaGroup(String area, String grp);
}