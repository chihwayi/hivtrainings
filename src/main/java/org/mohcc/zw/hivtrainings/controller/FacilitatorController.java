package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.Facilitator;
import org.mohcc.zw.hivtrainings.service.FacilitatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facilitator")
public class FacilitatorController {

	private final FacilitatorService facilitatorService;

    @Autowired
	public FacilitatorController(FacilitatorService facilitatorService) {
		super();
		this.facilitatorService = facilitatorService;
	}

	@GetMapping("/get-all")
    public ResponseEntity<List<Facilitator>> getAllFacilitator() {
        List<Facilitator> facilitatorInfoList = facilitatorService.getAllFacilitator();
        return ResponseEntity.ok(facilitatorInfoList);
    }
	
	@PostMapping("/save")
    public ResponseEntity<Facilitator> saveFacilitator(@RequestBody Facilitator trainingType) {
		Facilitator facilitatorInfo = facilitatorService.saveFacilitator(trainingType);
        return ResponseEntity.ok(facilitatorInfo);
    }
	
	@GetMapping("/get-by-program-area/{id}")
    public ResponseEntity<List<Facilitator>> getFacilitatorByProgramAreaId(@PathVariable String id) {
		List<Facilitator> facilitatorInfo = facilitatorService.getFacilitatorByProgramAreaId(id);
        return ResponseEntity.ok(facilitatorInfo);
    }
	
	@GetMapping("/check/{id}")
    public boolean checkFacilitatorInformationIdExists(@PathVariable String id) {
        return facilitatorService.existsById(id);
    }

}
