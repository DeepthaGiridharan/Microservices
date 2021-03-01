package com.cognizant.cartservice.dao;

import com.cognizant.cartservice.exception.CartEmptyException;
import com.cognizant.cartservice.model.Cart;

public interface CartDao {
	void addCartItem(String userId, long menuItemId);
			

	Cart getAllCartItems(String userId) throws CartEmptyException;

	void removeCartItem(String userId, long menuItemId) throws CartEmptyException;

}
