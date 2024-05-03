package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Facilitator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilitatorRepository extends JpaRepository<Facilitator,String>{
    
    @Query("SELECT pat FROM Facilitator pat WHERE pat.program_area_id = :program_area_id")
    List<Facilitator> getAllByProgram_area_id(String program_area_id);

}
