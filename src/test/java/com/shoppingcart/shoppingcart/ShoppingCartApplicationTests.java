package com.shoppingcart.shoppingcart;

import com.shoppingcart.shoppingcart.model.*;
import org.junit.Assert;
import org.junit.Test;


public class ShoppingCartApplicationTests {

	@Test
	public void step1(){
		Cart cart = Cart.getInstance();
		Item dove = ItemFactory.getItem(new SoapAbstractFactory(101,39.99));
		for (int i = 0; i < 5; i++)
			cart.addItems(dove);
		Assert.assertEquals(199.95,cart.getTotalPrice(),0.001);
	}

	@Test
	public void step2(){
		Cart cart = Cart.getInstance();
		Item dove = ItemFactory.getItem(new SoapAbstractFactory(101,39.99));
		for (int i = 0; i < 5; i++)
			cart.addItems(dove);
		for (int i = 0; i < 3; i++)
			cart.addItems(dove);
		Assert.assertEquals(319.92,cart.getTotalPrice(),0.001);
	}

	@Test
	public void step3(){
		Cart cart = Cart.getInstance();
		Item dove = ItemFactory.getItem(new SoapAbstractFactory(101,39.99));
		for (int i = 0; i < 2; i++)
		cart.addItems(dove);
		Item axe = ItemFactory.getItem(new DeoAbstractFactory(202,99.99));
		for (int i = 0; i < 2; i++)
		cart.addItems(axe);
		Assert.assertEquals(314.96,cart.getTotalPrice(),0.001);
	}



}
