package com.billing.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EleBilling
{
	public static void main(String[] args)
	{
		SpringApplication.run(EleBilling.class, args);
		System.out.println("Deployement Completed\nApplication is ready to Use");
	}
}