package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.ProgramArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramAreaRepository extends JpaRepository<ProgramArea,String>{

}
