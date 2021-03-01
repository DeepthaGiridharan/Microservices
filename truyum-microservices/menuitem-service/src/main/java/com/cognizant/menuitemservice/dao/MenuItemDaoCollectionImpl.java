package com.cognizant.menuitemservice.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.menuitemservice.MenuitemServiceApplication;

import com.cognizant.menuitemservice.model.MenuItem;
@Component
public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private ArrayList<MenuItem> menuItemList;
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuitemServiceApplication.class);
	public MenuItemDaoCollectionImpl() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("truyum.xml");
		this.menuItemList=(ArrayList<MenuItem>)context.getBean("menuItems");
	}

	public ArrayList<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("Start");
		LOGGER.info("End");
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		LOGGER.info("Start");
		List<MenuItem> list = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			if (((menuItem.getDateOfLaunch()).equals(new Date()))
					|| (menuItem.getDateOfLaunch()).before(new Date()) && menuItem.isActive()) {
				list.add(menuItem);
			}
		}
		LOGGER.info("End");
		return list;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("Start");
		for (MenuItem menuItemInList : menuItemList) {
			if (menuItem.equals(menuItemInList)) {
				menuItemList.remove(menuItemInList);
				menuItemList.add(menuItem);
				break;
			}
		}
		LOGGER.info("End");
		
	}

	

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for (MenuItem menuItemInList : menuItemList) {
			if (menuItemId == menuItemInList.getId())
				return menuItemInList;
		}
		return null;
	
	}

}

