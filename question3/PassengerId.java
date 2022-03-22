package com;

import java.io.Serializable;

public class PassengerId implements Serializable{
	private String passengerEmail;
	private long passengerMobile;
	public PassengerId() {}
	public PassengerId(String passengerEmail, long passengerMobile) {
		this.passengerEmail = passengerEmail;
		this.passengerMobile = passengerMobile;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public long getPassengerMobile() {
		return passengerMobile;
	}
	public void setPassengerMobile(long passengerMobile) {
		this.passengerMobile = passengerMobile;
	}

}