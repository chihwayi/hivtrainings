package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility,String> {
}
