package com.dmsd.s2sh.action;

import com.dmsd.s2sh.domain.Person;
import com.dmsd.s2sh.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public String savePerson() {
		// ApplicationContext context = WebApplicationContextUtils.
		// getRequiredWebApplicationContext(
		// ServletActionContext.getServletContext()
		// );
		// PersonService personService =
		// (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setName("黄渤");
		personService.savePerson(person);
		return null;
	}
}
