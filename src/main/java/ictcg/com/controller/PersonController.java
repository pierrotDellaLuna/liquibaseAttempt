package ictcg.com.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
	
	   private static List<Person> persons = new ArrayList<Person>();
	   
	    static {
	        persons.add(new Person("Bill", "Gates"));
	        persons.add(new Person("Steve", "Jobs"));
	    }

}
