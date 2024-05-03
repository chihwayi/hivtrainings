package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.TitleDesignation;
import org.mohcc.zw.hivtrainings.service.TitleDesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/title-designation")
public class TitleDesignationController {

	private TitleDesignationService titleDesignationService;

	@Autowired
	public TitleDesignationController(TitleDesignationService titleDesignationService) {
		super();
		this.titleDesignationService = titleDesignationService;
	}
	
	@GetMapping("/get-all")
    public ResponseEntity<List<TitleDesignation>> getTitleDesignation() {
        List<TitleDesignation> titleDesignationList = titleDesignationService.getTitleDesignationData();
        return ResponseEntity.ok(titleDesignationList);
    }

}
