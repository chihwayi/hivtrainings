package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.TraineeCurrentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeCurrentStatusRepository extends JpaRepository<TraineeCurrentStatus,String> {
}
