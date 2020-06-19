/**
 * 
 * @author Kayla Weselowski
 *receiver for command pattern and context for state pattern
 *private instances of each state 
 */

public class Blind {
	private String blindName;
	BlindState openState;
	BlindState closedState;
	BlindState openingState;
	BlindState closingState;
	BlindState pauseState;
	
	BlindState state; 

	public Blind(String name) {
		blindName = name;
		
		openState = new BlindOpen(this);
		closedState = new BlindClosed(this);
		openingState = new BlindOpening(this);
		closingState = new BlindClosing(this);
		pauseState = new BlindPause(this);
		state = closedState;
		
	}

	public void fullyOpen() {
		state.fullyOpen();
	}
	
	public void fullyClosed() {
		state.fullyClosed();
	}

	public void up() {
		state.up();
	}
	
	public void down() {
		state.down();
	}
	
	//sets new state
	public void setState(BlindState newState) {
		state = newState;
	}

	//returns current state
	public BlindState getState() {
		return state;
	}

	public BlindState getOpenState() {
		return openState;
	}

	public BlindState getClosedState() {
		return closedState;
	}
	
	public BlindState getOpeningState() {
		return openingState;
	}
	
	public BlindState getClosingState() {
		return closingState;
	}
	
	public BlindState getPauseState() {
		return pauseState;
	}

	//displays name of blind and current blind state
	public String toString() {
		return blindName + " is " + state.toString();
	}

	
}
