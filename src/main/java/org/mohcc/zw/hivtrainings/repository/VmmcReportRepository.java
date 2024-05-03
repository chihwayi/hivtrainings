package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.VmmcReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VmmcReportRepository extends JpaRepository<VmmcReport, String> {
}
