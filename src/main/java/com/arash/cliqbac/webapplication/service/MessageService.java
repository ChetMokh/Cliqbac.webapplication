package com.arash.cliqbac.webapplication.service;

import java.util.ArrayList;
import java.util.List;
import com.arash.cliqbac.webapplication.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		
		Message m1 = new Message(1L, "Hello World!", "Arash");
		Message m2 = new Message(2L, "Hello Jersey!", "Armin");
		List<Message> myList = new ArrayList<>();
		myList.add(m1);
		myList.add(m2);
		return myList;
	}
}
