/**
 * 
 * @author Kayla Weselowski
 *receiver for command pattern and context for state pattern
 *private instances of each state 
 */

public class Light {
	private String lightName;
	LightState onState;
	LightState lowState;
	LightState offState;

	LightState state;

	public Light(String name) {
		lightName = name;
		
		lowState = new LightLow(this);
		offState = new LightOff(this);
		onState = new LightOn(this);
		state = offState;
	}

	public void push() {
		state.push();
	}
	
	//sets new state of light
	public void setState(LightState newState) {
		state = newState;
	}

	//returns current state
	public LightState getState() {
		return state;
	}
	
	public LightState getLowState() {
		return lowState;
	}

	public LightState getOnState() {
		return onState;
	}

	public LightState getOffState() {
		return offState;
	}

	//displays name of light and current state
	public String toString() {
		return lightName + " is " + state.toString();
	}

}
