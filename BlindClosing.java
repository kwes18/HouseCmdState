/**
 * 
 * @author Kayla Weselowski
 * concrete state for door context
 *set state to current state for up command
 *and when door calls fullyClosed
 *other states print msgs 
 */
public class BlindClosing implements BlindState {

	Blind blind;

	public BlindClosing(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void fullyOpen() {
		System.out.println("...blind is closing. Press up twice to open.");
	}

	@Override
	public void fullyClosed() {
		System.out.println("...sensor dectects blind is fully closed.");
		blind.setState(blind.getClosedState());

	}

	@Override
	public void up() {
		System.out.println("...blind is paused.");
		blind.setState(blind.getPauseState());

	}

	@Override
	public void down() {
		System.out.println("...blind is closing. Please wait for it to fully close.");

	}
	
	public String toString() {
		return "closing";
	}

}
