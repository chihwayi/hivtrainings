package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.AreasOfServiceProvision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreasOfServiceProvisionRepository extends JpaRepository<AreasOfServiceProvision, String> {
}
