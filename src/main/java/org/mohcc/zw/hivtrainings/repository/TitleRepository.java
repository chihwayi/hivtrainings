package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository  extends JpaRepository<Title,String>{

}
