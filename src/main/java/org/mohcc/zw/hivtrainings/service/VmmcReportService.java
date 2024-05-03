package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.VmmcReport;

import java.util.List;
import java.util.Map;

public interface VmmcReportService {
    List<VmmcReport> generateVmmcReport();
    Map<String, Map<String, Map<String, Object>>> processVmmcReportData();
}
