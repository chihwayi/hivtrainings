package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.TrainingMethod;
import org.mohcc.zw.hivtrainings.service.TrainingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-method")
public class TrainingMethodController {

    private final TrainingMethodService trainingMethodService;

    @Autowired
    public TrainingMethodController(TrainingMethodService trainingMethodService) {
        this.trainingMethodService = trainingMethodService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<TrainingMethod>> getAllTrainingMethod() {
        List<TrainingMethod> trainingMethodList = trainingMethodService.getAllTrainingMethod();
        return ResponseEntity.ok(trainingMethodList);
    }

}
