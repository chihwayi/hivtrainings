package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.SupportingOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportingOrganizationRepository extends JpaRepository<SupportingOrganization,String>{

}
