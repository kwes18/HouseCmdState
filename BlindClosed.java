/**
 * 
 * @author Kayla Weselowski
 * concrete state for blinds
 * sets new state after up is called
 * other commands print msgs
 */

public class BlindClosed implements BlindState {

	Blind blind;
	
	public BlindClosed(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void fullyOpen() {
		System.out.println("...blind is fully closed. Press up to open.");

	}

	@Override
	public void fullyClosed() {
		System.out.println("...sensor dectects blind is fully open.");
		

	}

	@Override
	public void up() {
		System.out.println("...blind is opening.");
		blind.setState(blind.getOpeningState());

	}

	@Override
	public void down() {
		System.out.println("...blind is fully closed.");

	}
	
	public String toString() {
		return "fully closed";
	}

}
