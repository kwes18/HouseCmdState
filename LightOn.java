/**
 * 
 * @author Kayla Weselowski
 * concrete state for light context
 *set state to current state for push command
 */

public class LightOn implements LightState {
Light light;
	
	public LightOn(Light newLight) {
		light = newLight;
	}

	@Override
	public void push() {
		System.out.println("...turning off light.");
		
		light.setState(light.getOffState());
	}
	
	public String toString() {
		return "fully on";
	}
}
