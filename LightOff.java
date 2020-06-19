/**
 * 
 * @author Kayla Weselowski
 * concrete state for light context
 *set state to current state for push command
 */

public class LightOff implements LightState {
Light light;
	
	public LightOff(Light newLight) {
		light = newLight;
	}

	public void push() {
		System.out.println("...turning on low light.");
		
		light.setState(light.getLowState());
	}
	
	public String toString() {
		return "off";
	}
}
