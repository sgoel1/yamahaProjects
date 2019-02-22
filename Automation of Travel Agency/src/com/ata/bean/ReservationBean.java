package com.ata.bean;

import java.util.Date;

public class ReservationBean {
	private String reservationID;
	private String userID;
	private String routeID;
	private Date bookingDate;
	private Date journeyDate;
	private String vehicleID;
	private String driverID;
	private String bookingStatus;
	private double totalFare;
	private String boardingPoint;
	private String dropPoint;

	public ReservationBean() {
	}

	public ReservationBean(String reservationID, String userID, String routeID, Date bookingDate, Date journeyDate,
			String vehicleID, String driverID, String bookingStatus, double totalFare, String boardingPoint,
			String dropPoint) {
		super();
		this.reservationID = reservationID;
		this.userID = userID;
		this.routeID = routeID;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.vehicleID = vehicleID;
		this.driverID = driverID;
		this.bookingStatus = bookingStatus;
		this.totalFare = totalFare;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
	}

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

}
