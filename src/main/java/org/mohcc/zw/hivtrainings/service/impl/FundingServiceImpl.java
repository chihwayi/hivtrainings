package org.mohcc.zw.hivtrainings.service.impl;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.Funding;
import org.mohcc.zw.hivtrainings.repository.FundingRepository;
import org.mohcc.zw.hivtrainings.service.FundingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundingServiceImpl implements FundingService{

	private final FundingRepository fundingRepository;

	@Autowired
	public FundingServiceImpl(FundingRepository fundingRepository) {
		super();
		this.fundingRepository = fundingRepository;
	}

	@Override
	public Funding saveFunding(Funding funding) {
		return fundingRepository.saveAndFlush(funding);
	}

	@Override
	public Funding getFundingId(String id) {
		return fundingRepository.findById(id).orElse(null);
	}

	@Override
	public List<Funding> getAllFunding() {
		return fundingRepository.findAll();
	}

}
