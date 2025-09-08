package com.tnsif.SpringQ;

import org.springframework.stereotype.Component;

@Component
public class Food implements shoppingMall {
	public void purchase()
	{
		System.out.println("Order some food");
	}
}
