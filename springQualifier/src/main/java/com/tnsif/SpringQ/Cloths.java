package com.tnsif.SpringQ;

import org.springframework.stereotype.Component;

@Component
public class Cloths implements shoppingMall {
	public void purchase()
	{
		System.out.println("Order some cloths");
	}

}
