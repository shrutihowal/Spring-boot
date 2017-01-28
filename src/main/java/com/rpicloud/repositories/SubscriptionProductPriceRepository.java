package com.rpicloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rpicloud.models.SubscriptionProductPrice;

@Repository
public interface SubscriptionProductPriceRepository extends
		CrudRepository<SubscriptionProductPrice, Integer> {

}
