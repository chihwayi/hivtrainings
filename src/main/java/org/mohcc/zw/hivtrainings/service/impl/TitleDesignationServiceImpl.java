package org.mohcc.zw.hivtrainings.service.impl;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.TitleDesignation;
import org.mohcc.zw.hivtrainings.repository.TitleDesignationRepository;
import org.mohcc.zw.hivtrainings.service.TitleDesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleDesignationServiceImpl implements TitleDesignationService{

	private TitleDesignationRepository titleDesignationRepository;

	@Autowired
	public TitleDesignationServiceImpl(TitleDesignationRepository titleDesignationRepository) {
		this.titleDesignationRepository = titleDesignationRepository;
	}

	@Override
	public List<TitleDesignation> getTitleDesignationData() {
		// TODO Auto-generated method stub
		return titleDesignationRepository.getTitleDesignationData();
	}
	

}
