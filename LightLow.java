

public class LightLow implements LightState{

	Light light;
	
	public LightLow(Light newLight) {
		light = newLight;
	}

	@Override
	public void push() {
System.out.println("...turning light fully on.");
		
		light.setState(light.getOnState());
	}
	
	public String toString() {
		return "on low";
	}
}