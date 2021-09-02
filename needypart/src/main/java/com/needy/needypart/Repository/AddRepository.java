package com.needy.needypart.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.needy.needypart.model.Request;


@Repository
public interface AddRepository  extends CrudRepository<Request, Integer>{

}
