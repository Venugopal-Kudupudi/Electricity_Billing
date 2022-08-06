package com.billing.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.billing.command.Bill;
import com.billing.command.Consumption;
import com.billing.generate.BillGenerator;

@Controller
public class ReqController
{
	BillGenerator bgen = new BillGenerator();
	
	@RequestMapping("/*")
	public ModelAndView getHomePage()
	{
		return new ModelAndView("BillHome", "con", new Consumption());
	}
	
	@RequestMapping(path="/generate", method = RequestMethod.POST)
	public ModelAndView getBill(Consumption con)
	{
		Bill bill = bgen.generateBill(con);
		return new ModelAndView("BillPage", "bil", bill);
	}
}