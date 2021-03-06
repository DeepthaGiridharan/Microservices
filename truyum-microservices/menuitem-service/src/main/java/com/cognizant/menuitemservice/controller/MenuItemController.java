package com.cognizant.menuitemservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuitemservice.MenuitemServiceApplication;
import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	@Autowired
	private MenuItemService menuItemService;
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuitemServiceApplication.class);
	@GetMapping
	public List<MenuItem> getAllMenuItems() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItemListCustomer();
	}
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id) {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItem(id);
	}
	@PutMapping
	public void modifyMenuItem(@RequestBody @Valid MenuItem menuitem) {
		LOGGER.info("START");
		
		menuItemService.modifyMenuItem(menuitem);
		LOGGER.info("END");
	}
	
	

}
