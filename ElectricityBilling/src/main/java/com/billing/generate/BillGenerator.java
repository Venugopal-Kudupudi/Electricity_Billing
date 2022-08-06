package com.billing.generate;


import com.billing.command.Bill;
import com.billing.command.Consumption;

public class BillGenerator
{
	public Bill bill = new Bill();
	
	public Bill generateBill(Consumption con)
	{
		int kwh = Integer.parseInt(con.getUnits());
		String type = con.getType();
		
		float fix = 0;
		float duty = 0;
		float consume = 0;
		float customer = 0;
		float total = 0;
		
		bill.setKwh(kwh);
		bill.setType(type);
		
		if(type.equals("Commercial"))
		{
			fix = 75.00f;
			duty = kwh * 0.06f;
			
			if(kwh >=0)
			{
				if(kwh >= 50)
				{
					consume = 50 * 5.40f;
					kwh = kwh - 50;
				}
				else
				{
					consume = kwh * 5.40f;
					kwh = kwh - 50;
					customer = 30;
				}
			}
			
			if(kwh >= 0)
			{
				if(kwh >= 50)
				{
					consume = consume + (50 * 7.65f);
					kwh = kwh - 50;
				}
				else
				{
					consume = consume + (kwh * 7.65f);
					kwh = kwh - 50;
					customer = 40;
				}
			}
			if(kwh >= 0)
			{
				if(kwh >= 200)
				{
					consume = consume + (200 * 9.05f);
					kwh = kwh - 200;
				}
				else
				{
					consume = consume + (kwh * 9.05f);
					kwh = kwh - 200;
					customer = 45;
				}
			}
			if(kwh >= 0)
			{
				if(kwh >= 200)
				{
					consume = consume + (200 * 9.6f);
					kwh = kwh - 200;
				}
				else
				{
					consume = consume + (kwh * 9.6f);
					kwh = kwh - 200;
					customer = 45;
				}
			}if(kwh >= 0)
			{
				consume = consume + (kwh * 10.15f);
				customer = 45;
			}
			
			total = consume + customer + duty + fix;
			
			bill.setConsume(consume);
			bill.setCustomer(customer);
			bill.setDuty(duty);
			bill.setFixed(fix);
			bill.setTotal(total);
			return bill;
		}
		
		
		if(type.equals("Domestic"))
		{
			fix = 10.00f;
			duty = kwh * 0.06f;
			
			if(kwh >=0)
			{
				if(kwh >= 30)
				{
					consume = 30 * 1.90f;
					kwh = kwh - 30;
				}
				else
				{
					consume = kwh * 1.90f;
					kwh = kwh - 30;
					customer = 25;
				}
			}
			
			if(kwh >= 0)
			{
				if(kwh >= 45)
				{
					consume = consume + (45 * 3f);
					kwh = kwh - 45;
				}
				else
				{
					consume = consume + (kwh * 3f);
					kwh = kwh - 45;
					customer = 30;
				}
			}
			if(kwh >= 0)
			{
				if(kwh >= 50)
				{
					consume = consume + (50 * 4.50f);
					kwh = kwh - 50;
				}
				else
				{
					consume = consume + (kwh * 4.50f);
					kwh = kwh - 50;
					customer = 45;
				}
			}
			if(kwh >= 0)
			{
				if(kwh >= 100)
				{
					consume = consume + (100 * 6f);
					kwh = kwh - 100;
				}
				else
				{
					consume = consume + (kwh * 6f);
					kwh = kwh - 100;
					customer = 50;
				}
			}
			
			if(kwh >= 0)
			{
				if(kwh >= 175)
				{
					consume = consume + (175 * 8.75f);
					kwh = kwh - 175;
				}
				else
				{
					consume = consume + (kwh * 8.75f);
					kwh = kwh - 175;
					customer = 55;
				}
			}
			if(kwh >= 0)
			{
				consume = consume + (kwh * 9.75f);
				customer = 55;
			}
			
			total = consume + customer + duty + fix;
			
			bill.setConsume(consume);
			bill.setCustomer(customer);
			bill.setDuty(duty);
			bill.setFixed(fix);
			bill.setTotal(total);
			return bill;
		}
		return bill;
	}
}