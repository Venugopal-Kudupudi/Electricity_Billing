package com.billing.command;

public class Bill {
	private float consume;
	private float fixed;
	private float customer;
	private float duty;
	private float total;
	private int kwh;
	private String type;

	public int getKwh() {
		return kwh;
	}

	public void setKwh(int kwh) {
		this.kwh = kwh;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getConsume() {
		return consume;
	}

	public void setConsume(float consume) {
		this.consume = consume;
	}

	public float getFixed() {
		return fixed;
	}

	public void setFixed(float fixed) {
		this.fixed = fixed;
	}

	public float getCustomer() {
		return customer;
	}

	public void setCustomer(float customer) {
		this.customer = customer;
	}

	public float getDuty() {
		return duty;
	}

	public void setDuty(float duty) {
		this.duty = duty;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}