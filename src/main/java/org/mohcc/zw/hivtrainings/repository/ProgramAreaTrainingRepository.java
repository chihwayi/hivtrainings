package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.ProgramAreaTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramAreaTrainingRepository extends JpaRepository<ProgramAreaTraining,String>{
    @Query("SELECT pat FROM ProgramAreaTraining pat WHERE pat.programId = :programId")
    List<ProgramAreaTraining> findByProgramId(String programId);

}
