package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.VmmcReport;
import org.mohcc.zw.hivtrainings.service.VmmcReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vmmc-report")
public class VmmcReportController {

    private final VmmcReportService vmmcReportService;

    @Autowired
    public VmmcReportController(VmmcReportService vmmcReportService) {
        this.vmmcReportService = vmmcReportService;
    }

    @GetMapping("/report")
    ResponseEntity<List<VmmcReport>> getVmmcReportData(){
        List<VmmcReport> vmmcReportList = vmmcReportService.generateVmmcReport();
        return ResponseEntity.ok(vmmcReportList);
    }

    @GetMapping("/report-map")
    ResponseEntity<Map<String, Map<String, Map<String, Object>>>> processVmmcReportData(){
        Map<String, Map<String, Map<String, Object>>> stringMapMap = vmmcReportService.processVmmcReportData();

        return ResponseEntity.ok(stringMapMap);
    }
}
