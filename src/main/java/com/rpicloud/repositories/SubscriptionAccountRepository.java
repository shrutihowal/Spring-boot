package com.rpicloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rpicloud.models.SubscriptionAccount;
@Repository
public interface SubscriptionAccountRepository extends CrudRepository<SubscriptionAccount, Integer> {

}
