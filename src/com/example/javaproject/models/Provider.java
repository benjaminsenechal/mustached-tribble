package com.example.javaproject.models;

import java.util.ArrayList;
import java.util.List;

public class Provider {
	private final static ArrayList<User> usersContext;
	private final static ArrayList<Person> peopleContext;
	private final static ArrayList<String> abilitiesContext;
	
	static{
		usersContext = new ArrayList<User>();
		
		User user;
		
		user = new User();
		user.setLogin("bob.morane@yopmail.com");
		user.setPassword("P@ssword");
		user.setPseudo("BobMorane");
		usersContext.add(user);
		
		user = new User();
		user.setLogin("a");
		user.setPassword("a");
		user.setPseudo("AaaAAaaaAA");
		usersContext.add(user);
		
		user = new User();
		user.setLogin("glop@yopmail.com");
		user.setPassword("P@ssword");
		user.setPseudo("Glop");
		usersContext.add(user);
		
		
		peopleContext = new ArrayList<Person>();
		Person person;
		Address address;
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Robert");
		person.setLastname("Martin");
		person.setMale(true);
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/M05.png");
		person.setPhoneNumber("0600000000");
		person.setEmail("Robert@gmail.com");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		
		person.setAddress(address);
		person.setFirstname("George");
		person.setLastname("Durant");
		person.setMale(true);
		person.setEmail("George@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/iconshock_guys/512/andrew.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Michel");
		person.setLastname("Denis");
		person.setMale(true);
		person.setEmail("Michel@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/iconshock_guys/512/andrew.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Frederic");
		person.setLastname("Milano");
		person.setEmail("Frederic@gmail.com");
		person.setMale(true);
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/iconshock_guys/512/andrew.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet technique");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Lisat");
		person.setLastname("Matisse");
		person.setMale(false);
		person.setEmail("Lisat@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/FA04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Tiphaine");
		person.setLastname("Legarek");
		person.setMale(false);
		person.setEmail("Tiphaine@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/FA04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet technique");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Marc");
		person.setLastname("Vandenbusch");
		person.setMale(false);
		person.setEmail("Marc@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/FI02.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Gislaine");
		person.setLastname("Gallois");
		person.setMale(true);
		person.setEmail("Gislaine@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/iconshock_guys/512/andrew.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Comptable");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Audrey");
		person.setLastname("Leval");
		person.setMale(false);
		person.setEmail("Audrey@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/FI02.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Assistante agence");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("John");
		person.setLastname("Gleek");
		person.setMale(true);
		person.setEmail("John@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/M05.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Directeur agence");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Jean Claude");
		person.setLastname("Convenan");
		person.setMale(true);
		person.setEmail("Jean-Claude@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/M05.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Commercial");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Melodie");
		person.setLastname("Galard");
		person.setMale(false);
		person.setEmail("Melodie@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/FA04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("RH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Alain");
		person.setLastname("Li");
		person.setMale(true);
		person.setEmail("Alain@gmail.com");
		person.setAvatar("http://png-1.findicons.com/files/icons/1072/face_avatars/300/i04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("RH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Claire");
		person.setLastname("Pilaud");
		person.setMale(true);
		person.setEmail("Alain@gmail.com");
		person.setAvatar("http://png-1.findicons.com/files/icons/1072/face_avatars/300/i04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("DRH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Karim");
		person.setLastname("Balid");
		person.setMale(true);
		person.setEmail("Karim@gmail.com");
		person.setAvatar("https://cdn1.iconfinder.com/data/icons/faceavatars/PNG/M05.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Antoine");
		person.setLastname("Malle");
		person.setMale(true);
		person.setEmail("Antoine@gmail.com");
		person.setAvatar("http://png-1.findicons.com/files/icons/1072/face_avatars/300/i04.png");
		person.setPhoneNumber("0600000000");
		person.setDescription("DBA");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		abilitiesContext = new ArrayList<String>();
		abilitiesContext.add("C#");
		abilitiesContext.add(".Net");
		abilitiesContext.add("WCF");
		abilitiesContext.add("Sql Server");
		abilitiesContext.add("Office");
		abilitiesContext.add("Ciel");
		abilitiesContext.add("Scrum Master");
		abilitiesContext.add("MS Project");
	}
	
	
	public static List<User> getAlluser(){
		return new ArrayList<User>(usersContext);
	}
	
	public static User login(String login, String password){
		if(login != null && password != null)
			for(User user : usersContext)
				if(password.equals(user.getPassword()) && login.equals(user.getLogin()))
					return user;
		return null;
	}
	
	public static List<Person> getAllPeople(){
		return new ArrayList<Person>(peopleContext);
	}
	
	public static Person getPersonById(int id){
		for(Person person : peopleContext)
			if(person.getId() == id)
				return person;
		return null;
	}
	
	public static List<Person> searchPerson(String lastname, String firstname){
		List<Person> tofilter = getAllPeople();
		if(lastname != null)
			tofilter = filterByLastname(lastname, tofilter);
		if(firstname != null)
			tofilter = filterByFirstname(firstname, tofilter);
		return tofilter;
	}
	
	private static List<Person> filterByLastname(String lastname, List<Person> people){
		ArrayList<Person> result = new ArrayList<Person>();
		for(Person person : people)
			if(person.getLastname().contains(lastname))
				result.add(person);
		return result;
	}
	
	private static List<Person> filterByFirstname(String firstname, List<Person> people){
		ArrayList<Person> result = new ArrayList<Person>();
		for(Person person : people)
			if(person.getFirstname().contains(firstname))
				result.add(person);
		return result;
	}
}
