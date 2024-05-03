package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.TrainingData;

import java.util.List;

public interface TrainingDataService {
    TrainingData saveTrainingData(TrainingData trainingData);
    List<TrainingData> getAllTrainingData();
}
