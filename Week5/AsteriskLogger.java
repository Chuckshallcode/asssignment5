package Week5;

public class AsteriskLogger implements Logger { //implements gave us a quick way to copy the logger methods

	public void log(String log) { //we made sure to specify log in the parameters
		System.out.println("***" + log + "***");		
	}

	public void error(String error) { //we made sure to specify error in the parameters
		System.out.println("******************"); //Making three lines is a lot simpler than trying to do it in
		System.out.println("***" + "Error: " + error + "***");  //one line
		System.out.println("******************");
		
	}
}
