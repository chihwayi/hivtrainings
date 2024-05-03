package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.TrainingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingDataRepository extends JpaRepository<TrainingData,String>{

    @Query("SELECT td FROM TrainingData td JOIN FETCH td.facilitator_id JOIN FETCH td.method_id")
    List<TrainingData> findAllWithDataAndFacilitatorsAndMethods();

    @Query("SELECT td FROM TrainingData td JOIN FETCH td.facilitator_id")
    List<TrainingData> findAllWithDataAndFacilitators();

    @Query("SELECT td FROM TrainingData td JOIN FETCH td.method_id")
    List<TrainingData> findAllWithDataAndMethods();

}
