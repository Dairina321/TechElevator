package com.techelevator.model;

public class Weather {

	private String parkCode;
	private int fiveDay;
	private double low;
	private double high;
	private String forecast;
	private String tempFC;

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	public int getFiveDay() {
		return fiveDay;
	}

	public void setFiveDay(int fiveDay) {
		this.fiveDay = fiveDay;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public String getForecast() {
		return forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	public String getTempFC() {
		return tempFC;
	}

	public void setTempFC(String tempFC) {
		this.tempFC = tempFC;
	}

	public void convertHighTempToC(String tempFC, double high) {
		if (tempFC.equals("c")) {
			double temp = (high - 32) * (5.0 / 9.0);
			setHigh(temp);
		} else {
			double temp = (high * (9.0 / 5.0)) + 32;
			setHigh(temp);
		}
	}
	
	public void convertLowTempToC(String tempFC, double low) {
		if (tempFC.equals("c")) {
			double temp = (low - 32) * (5.0 / 9.0);
			setLow(temp);
		} else {
			double temp = (low * (9.0 / 5.0)) + 32;
			setLow(temp);
		}
	}
}