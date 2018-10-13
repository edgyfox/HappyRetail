package com.happyretail.util;

public class PriceRange {
	private double minRange;
	private double maxRange;
	public PriceRange(double minRange, double maxRange) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
	}
	public double getMinRange() {
		return minRange;
	}
	public void setMinRange(double minRange) {
		this.minRange = minRange;
	}
	public double getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(double maxRange) {
		this.maxRange = maxRange;
	}
}
