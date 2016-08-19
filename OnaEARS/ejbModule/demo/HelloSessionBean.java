package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloSessionBean implements HelloSessionBeanRemote, HelloSessionBeanLocal {

	public HelloSessionBean() {
	}

	@Override
	public String helloWorld() {
		return "hello world";
	}

	@Override
	public String hi(String fullName) {
		return "Hi " + fullName;
	}

}
