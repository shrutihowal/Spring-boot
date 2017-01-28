package com.rpicloud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Maniac
 * 
 */
@Entity
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subscriptionId;
	private String sbnDefinationId;
	private String acquisitionDate;
	private String subblock;
	private String siteId;
	private String userGroupId;

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSbnDefinationId() {
		return sbnDefinationId;
	}

	public void setSbnDefinationId(String sbnDefinationId) {
		this.sbnDefinationId = sbnDefinationId;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getSubblock() {
		return subblock;
	}

	public void setSubblock(String subblock) {
		this.subblock = subblock;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}

}
