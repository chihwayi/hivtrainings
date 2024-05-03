package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.TrainingType;
import org.mohcc.zw.hivtrainings.service.TrainingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-type")
public class TrainingTypeController {

	private final TrainingTypeService trainingTypeService;

	@Autowired
	public TrainingTypeController(TrainingTypeService trainingTypeService) {
		super();
		this.trainingTypeService = trainingTypeService;
	}
	
	@GetMapping("/get-all")
    public ResponseEntity<List<TrainingType>> getAllTrainingType() {
        List<TrainingType> trainingTypeInfoList = trainingTypeService.getAllTrainingType();
        return ResponseEntity.ok(trainingTypeInfoList);
    }
	
	@PostMapping("/save")
    public ResponseEntity<TrainingType> saveTrainingType(@RequestBody TrainingType trainingType) {
		TrainingType trainingTypeInfo = trainingTypeService.saveTrainingType(trainingType);
        return ResponseEntity.ok(trainingTypeInfo);
    }

}
