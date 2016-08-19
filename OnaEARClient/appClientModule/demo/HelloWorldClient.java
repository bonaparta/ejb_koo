package demo;

import javax.naming.InitialContext;

import util.*;

public class HelloWorldClient {
	public String hello() {
		try {
			InitialContext ic = Init.getInit();
			HelloSessionBeanRemote helloSessionBeanRemote = (HelloSessionBeanRemote) ic.lookup("demo.HelloSessionBeanRemote");
			return helloSessionBeanRemote.helloWorld();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public String hi(String fullName) {
		try {
			InitialContext ic = Init.getInit();
			HelloSessionBeanRemote helloSessionBeanRemote = (HelloSessionBeanRemote) ic.lookup("demo.HelloSessionBeanRemote");
			return helloSessionBeanRemote.hi(fullName);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
