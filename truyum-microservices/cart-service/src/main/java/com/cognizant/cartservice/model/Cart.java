package com.cognizant.cartservice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.cartservice.model.MenuItem;

@Component
	public class Cart {
		private List<MenuItem> menuItemList;
		private double total;

		public List<MenuItem> getMenuItemList() {
			return menuItemList;
		}

		public void setMenuItemList(List<MenuItem> menuItemList) {
			this.menuItemList = menuItemList;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		
		public Cart(List<MenuItem> menuItemList, double total) {
			setMenuItemList(menuItemList);
			setTotal(total);
		}

		public Cart() {
			super();

		}
	}

