package com.rpicloud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscriptionProductPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subProductprice;
	private String productId;
	private int maxQuantity;
	private String subscriptionid;
	private String lockedRenewalPrice;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public String getSubscriptionid() {
		return subscriptionid;
	}

	public void setSubscriptionid(String subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public String getLockedRenewalPrice() {
		return lockedRenewalPrice;
	}

	public void setLockedRenewalPrice(String lockedRenewalPrice) {
		this.lockedRenewalPrice = lockedRenewalPrice;
	}

}
