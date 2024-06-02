package Week5;



public class App {

	public static void main(String[] args) { // main method gives us a location to output the classes
		
		AsteriskLogger firstTest = new AsteriskLogger();
		firstTest.log("Mouse"); //connects to the first method in AsteriskLogger
		firstTest.error("Mouse"); //connects to the second method in AsteriskLogger
	
		SpacedLogger secondTest = new SpacedLogger();
		secondTest.log("Mouse"); //connects to the first method in SpacedLogger
		secondTest.error("Mouse"); //connects to the first method in SpacedLogger
	}

}