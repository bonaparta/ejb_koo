package util;

import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Init {
	public static InitialContext getInit() {
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNIStateFactoryImpl");
		try {
			return new InitialContext(props);
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}
	}
}
