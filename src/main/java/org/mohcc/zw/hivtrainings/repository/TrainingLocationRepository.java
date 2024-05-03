package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.TrainingLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingLocationRepository extends JpaRepository<TrainingLocation,String>{

}
