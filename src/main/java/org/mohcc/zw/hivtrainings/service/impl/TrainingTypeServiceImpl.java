package org.mohcc.zw.hivtrainings.service.impl;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.TrainingType;
import org.mohcc.zw.hivtrainings.repository.TrainingTypeRepository;
import org.mohcc.zw.hivtrainings.service.TrainingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingTypeServiceImpl implements TrainingTypeService{

	private final TrainingTypeRepository trainingTypeRepository;

	@Autowired
	public TrainingTypeServiceImpl(TrainingTypeRepository trainingTypeRepository) {
		super();
		this.trainingTypeRepository = trainingTypeRepository;
	}

	@Override
	public TrainingType saveTrainingType(TrainingType trainingType) {
		return trainingTypeRepository.save(trainingType);
	}

	@Override
	public TrainingType getTrainingTypeById(String id) {
		return trainingTypeRepository.findById(id).orElse(null);
	}

	@Override
	public List<TrainingType> getAllTrainingType() {
		return trainingTypeRepository.findAll();
	}

}
