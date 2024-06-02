package Week5;

public class SpacedLogger implements Logger { //implements let us copy the two logger methods

	public void log(String log) { //we made sure to specify log in the parameters
		String spaceOut = log.replace("", " "); // Detects when there are no spaces, inserts whitespace there
		System.out.println(spaceOut.trim()); // does the effect of putting space between characters
	}

	public void error(String error) {
		String spaceOut = error.replace("", " ");
		System.out.println("ERROR: "+ spaceOut.trim()); //String concatenation is always helpful
	}

}
