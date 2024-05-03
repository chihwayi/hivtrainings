package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.TrainingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingTypeRepository extends JpaRepository<TrainingType,String>{

}
