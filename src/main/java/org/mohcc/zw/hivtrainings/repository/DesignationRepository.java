package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository  extends JpaRepository<Designation,String>{

}
