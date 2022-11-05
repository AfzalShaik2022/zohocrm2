package com.zohocrm_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm_2.Services.ContactsService;
import com.zohocrm_2.entities.Contact;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactsService;
	@RequestMapping("/listContacts")
	public String listContacts(ModelMap model) {
	List<Contact>contacts =contactsService.getAllContacts();
	model.addAttribute("contacts", contacts);
	return "list_contacts";
		
	}
}
