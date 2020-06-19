/**
 * 
 * @author Kayla Weselowski
 * concrete state for door context
 *set state to current state for down command 
 *and when door calls fullyOpen
 *other states print msgs 
 */
public class BlindOpening implements BlindState {

Blind blind;
	
	public BlindOpening(Blind newBlind) {
		blind = newBlind;
	}
	
	@Override
	public void fullyOpen() {
		System.out.println("...sensor dectects blind is fully open.");
		blind.setState(blind.getOpenState());
	}

	@Override
	public void fullyClosed() {
		System.out.println("...blind is opening. Press down twice to close.");

	}

	@Override
	public void up() {
		System.out.println("...blind is opening. Please wait for it to fully open.");
	}

	@Override
	public void down() {
		System.out.println("...blind is paused.");
		blind.setState(blind.getPauseState());

	}
	
	public String toString() {
		return "opening";
	}

}
