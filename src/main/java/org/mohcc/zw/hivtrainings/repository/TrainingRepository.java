package org.mohcc.zw.hivtrainings.repository;
import org.mohcc.zw.hivtrainings.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training,String> {
    //Training findTrainingByBasic_information_id(String id);
}
