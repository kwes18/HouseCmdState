/**
 * 
 * @author Kayla Weselowski
 * concrete state for door context
 *set state to current state for down command
 *other states print msgs 
 */
public class BlindOpen implements BlindState {
	Blind blind;
	
	public BlindOpen(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void fullyOpen() {
		System.out.println("...sensor dectects blind is fully open.");
	}

	@Override
	public void fullyClosed() {
		System.out.println("...blind is fully open. Press down to close.");
		
	}

	@Override
	public void up() {
		System.out.println("...blind is fully open.");
		
	}

	@Override
	public void down() {
		System.out.println("...blind is closing.");
		blind.setState(blind.getClosingState());
		
	}
	
	public String toString() {
		return "fully open";
	}


}
