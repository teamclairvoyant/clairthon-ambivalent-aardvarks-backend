package com.cv.srm.repository;

import com.cv.srm.model.RnrItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RnrItemRepository extends JpaRepository<RnrItem, String> {

}
