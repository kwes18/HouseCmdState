/*
 * @author Kayla Weselowski
 * main driver for system
 */
public class RemoteLoader {

	public static void main(String[] args) throws CloneNotSupportedException {
		// set up new receivers/contexts
		Blind blind = new Blind("living room blind");
		Light light = new Light("salt lamp");
		Music music = new Music("stereo");
		// rc instance obj
		RemoteControl rc = new RemoteControl(blind, light, music);

		// arrange for the blinds to go through a cycle of states

		System.out.println("----------blind command and state sequence----------");
		rc.bdownPushed();// already fully closed
		rc.bupPushed(); // up button on remote pushed, opening
		rc.bdownPushed(); // pause
		rc.bupPushed();// opening
		rc.bupPushed();// already opening wait
		blind.fullyOpen(); // the sensors detect the blind is fully open
		rc.bupPushed();// already fully open
		rc.bdownPushed(); // down button on remote pushed, closing
		rc.bupPushed();// pause
		rc.bdownPushed();// closing
		rc.bdownPushed();// already closing wait
		blind.fullyClosed(); // the sensors detect the blind is fully closed

		// arrange for the light to go through its states
		System.out.println("\n----------light command and state sequence----------");
		rc.lightBtnPushed();// low
		rc.lightBtnPushed();// fully on
		rc.lightBtnPushed();// off
		
		rc.undo();//on
		rc.undo();//low
		rc.undo();//off
		rc.redo();//low

		// arrange for the music to go through its states
		System.out.println("\n----------music command and state sequence----------");
		rc.musicBtnPushed();// play
		rc.musicBtnPushed();// pause

		rc.undo();//music play

		System.out.println("\n Final States:" + blind + ", " + light + ", and " + music + "."); // the devices' states
																								// are displayed with
																								// their toString
																							// methods

	}

}
