package com.rpicloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rpicloud.models.A;

@Repository 
public interface ARepository extends CrudRepository<A,String> {

}
