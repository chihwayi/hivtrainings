package org.mohcc.zw.hivtrainings.repository;
import org.mohcc.zw.hivtrainings.model.RemarksComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemarksCommentsRepository extends JpaRepository<RemarksComments,String> {

}
