package org.mohcc.zw.hivtrainings.service;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.Funding;

public interface FundingService {
	Funding saveFunding(Funding funding);
	Funding getFundingId(String id);
	List<Funding> getAllFunding();

}
