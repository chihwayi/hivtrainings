package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.Training;

import java.util.List;

public interface TrainingService {
    Training saveTraining(Training training);
    Training getTrainingById(String id);
    //Training getTrainingByBasicInformationId(String id);
    List<Training> getAllTrainings();
}
