package com.needy.needypart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.needy.needypart.model.Donation;
import com.needy.needypart.model.Request;

@Repository
public interface NeedyRepository extends JpaRepository<Donation, Integer>{

	
}
