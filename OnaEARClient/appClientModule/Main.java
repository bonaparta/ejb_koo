import demo.*;

public class Main {

	public static void main(String[] args) {
		try {
			HelloWorldClient helloWorldClient = new HelloWorldClient();
			System.out.println(helloWorldClient.hello());
			System.out.println(helloWorldClient.hi("ABC"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
