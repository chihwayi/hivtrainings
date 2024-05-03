package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,String> {
}
