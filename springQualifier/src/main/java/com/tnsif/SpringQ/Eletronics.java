package com.tnsif.SpringQ;

import org.springframework.stereotype.Component;

@Component
public class Eletronics implements shoppingMall {

	public void purchase()
	{
		System.out.println("Order some food");
	}
}
