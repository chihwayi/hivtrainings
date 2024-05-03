package org.mohcc.zw.hivtrainings.controller;
import org.mohcc.zw.hivtrainings.model.TraineeCurrentStatus;
import org.mohcc.zw.hivtrainings.service.TraineeCurrentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/current-status")
public class TraineeCurrentStatusController {

    private final TraineeCurrentStatusService traineeCurrentStatusService;

    @Autowired
    public TraineeCurrentStatusController(TraineeCurrentStatusService traineeCurrentStatusService) {
        this.traineeCurrentStatusService = traineeCurrentStatusService;
    }

    @GetMapping("/get-all")
    ResponseEntity<List<TraineeCurrentStatus>> getAllTraineeCurrentStatus(){
        List<TraineeCurrentStatus> currentStatusList = traineeCurrentStatusService.getAllTraineeCurrentStatus();
        return ResponseEntity.ok(currentStatusList);
    }
}
