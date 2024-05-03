package org.mohcc.zw.hivtrainings.service;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.TrainingType;

public interface TrainingTypeService {
	
	TrainingType saveTrainingType(TrainingType trainingType);
	TrainingType getTrainingTypeById(String id);
	List<TrainingType> getAllTrainingType();

}
