package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(PassengerId.class)
public class Passenger {
	@Id private String passengerEmail;
	@Id private long passengerMobile;
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
	
	private String passengerName;
	private String Source;
	private String destination;
	public Passenger() {}
	public Passenger(String passengerName, String source, String destination) {
		this.passengerName = passengerName;
		Source = source;
		this.destination = destination;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
}