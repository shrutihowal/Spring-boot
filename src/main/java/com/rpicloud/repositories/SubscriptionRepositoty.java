package com.rpicloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rpicloud.models.Subscription;

@Repository
public interface SubscriptionRepositoty extends CrudRepository<Subscription, Integer>{

}
