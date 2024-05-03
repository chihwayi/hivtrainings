package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.TraineeCurrentStatus;
import org.mohcc.zw.hivtrainings.repository.TraineeCurrentStatusRepository;
import org.mohcc.zw.hivtrainings.service.TraineeCurrentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeCurrentStatusServiceImpl implements TraineeCurrentStatusService {

    private final TraineeCurrentStatusRepository traineeCurrentStatusRepository;

    @Autowired
    public TraineeCurrentStatusServiceImpl(TraineeCurrentStatusRepository traineeCurrentStatusRepository) {
        this.traineeCurrentStatusRepository = traineeCurrentStatusRepository;
    }

    @Override
    public List<TraineeCurrentStatus> getAllTraineeCurrentStatus() {
        return traineeCurrentStatusRepository.findAll();
    }
}
