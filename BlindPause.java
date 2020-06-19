/**
 * 
 * @author Kayla Weselowski
 * concrete state for blind context
 *set state to current state for up and down commands
 *other states print msgs 
 */
public class BlindPause implements BlindState {

	Blind blind;

	public BlindPause(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void fullyOpen() {
		System.out.println("...blind is paused. Push up to open.");

	}

	@Override
	public void fullyClosed() {
		System.out.println("...blind is paused. Push down to close.");

	}

	@Override
	public void up() {
		System.out.println("...blind is opening.");
		blind.setState(blind.getOpeningState());
	}

	@Override
	public void down() {
		System.out.println("...blind is closing.");
		blind.setState(blind.getClosingState());
	}
	
	public String toString() {
		return "paused";
	}

}
