/**
 * 
 * @author Kayla Weselowski concrete command class for light
 *
 */
public class LPushCmd extends Command{
	Light light;

	public LPushCmd(Light newLight) {
		light = newLight;
	}

	public void execute() {
		light.push();
	}

	public void undo() {
		light.push();
	};
}
