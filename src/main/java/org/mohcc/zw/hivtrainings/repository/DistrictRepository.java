package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District,String> {
}
