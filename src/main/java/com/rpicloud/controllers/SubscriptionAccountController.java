package com.rpicloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rpicloud.models.SubscriptionAccount;
import com.rpicloud.repositories.SubscriptionAccountRepository;

@RestController
@RequestMapping("/ftr/products")
public class SubscriptionAccountController {
	
	@Autowired
	SubscriptionAccountRepository repository;
	
	 @RequestMapping(method = RequestMethod .POST)
     public ResponseEntity<?> addPie(@RequestBody SubscriptionAccount subscriptionAccount) {
          	
     	repository.save(subscriptionAccount);        	
     	System.out.println("Value Of Subscription account "+subscriptionAccount);
        return new ResponseEntity<SubscriptionAccount>(subscriptionAccount, HttpStatus.CREATED);
     }
}
