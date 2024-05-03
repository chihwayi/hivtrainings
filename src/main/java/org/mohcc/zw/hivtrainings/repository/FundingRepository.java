package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Funding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundingRepository extends JpaRepository<Funding,String>{

}
