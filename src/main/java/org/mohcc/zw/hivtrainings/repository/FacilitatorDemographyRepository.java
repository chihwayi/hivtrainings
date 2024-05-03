package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.FacilitatorDemography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilitatorDemographyRepository extends JpaRepository<FacilitatorDemography,String>{
    @Query("Select new FacilitatorDemography(a.facilitator_id, a.basic_information_id, b.name, b.surname, a.program_area_id)" +
            " from BasicInformation b JOIN Facilitator a ON b.basic_information_id = a.basic_information_id " +
            "WHERE a.program_area_id = :program_area_id")
    List<FacilitatorDemography> getAllFacilitatorDemographyDataByProgramId(String program_area_id);
}
