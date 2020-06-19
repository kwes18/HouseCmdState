
import java.util.Stack;
/*
 * @author Kayla Weselowski 
 */

//
// This is the invoker for the command design pattern
//implements Cloneable to clone command objs
//
public class RemoteControl implements Cloneable {
	private Blind blind;
	private Light light; //Receiver 
	private Music music;
	
	private Command blindCmd;
	private Command lightCmd; //command obj for light
	private Command musicCmd;
	//stack for saving undo and redo commands
	private Stack<Command> undoStack = new Stack<Command>();
	private Stack<Command> redoStack = new Stack<Command>();

	/*
	 * constructor for rc, can set names of light, music, and blind objs
	 * set up command for light... only one
	 */
	public RemoteControl(Blind newBlind, Light newLight, Music newMusic) {
		light = newLight;
		blind = newBlind;
		music = newMusic;
		
		lightCmd = (Command) new LPushCmd(light);
		musicCmd = (Command) new MPushCmd(music);
	}

	/*
	 * sets new up command to current command obj
	 * passes on execute msg
	 */
	public void bupPushed() throws CloneNotSupportedException {
		System.out.println("The blind up button was pushed.");
		blindCmd = (Command) new BUpCmd(blind);
		blindCmd.execute();
		undoStack.push((Command) blindCmd.clone());//save to undo stack
	}

	public void bdownPushed() throws CloneNotSupportedException {
		System.out.println("The blind down button was pushed.");
		blindCmd = (Command) new BDownCmd(blind);
		blindCmd.execute();
		undoStack.push((Command) blindCmd.clone());
	}
	
	public void lightBtnPushed() throws CloneNotSupportedException {
		System.out.println("The light button was pushed.");
		lightCmd.execute();
		undoStack.push((Command) lightCmd.clone());//save to undo stack
	}


	public void musicBtnPushed() throws CloneNotSupportedException {
		System.out.println("The music button was pushed.");
		musicCmd.execute();
		undoStack.push((Command) musicCmd.clone());
	}

	/*
	 * if empty-nothing to undo return
	 * else pop command obj off undo stack and undo it
	 * push to redo stack
	 */
	public void undo() {
		System.out.println("The undo button was pushed.");
		if (undoStack.isEmpty())
			return;
		Command toUndo = undoStack.pop();
		toUndo.undo();
		redoStack.push(toUndo);
	}
	/*
	 * nothing to redo, return
	 * else pop redo stack obj and execute it
	 * push to undo stack
	 */
	public void redo() {
		System.out.println("The redo button was pushed.");
		if (redoStack.isEmpty())
			return;
		Command toRedo = redoStack.pop();
		toRedo.execute();
		undoStack.push(toRedo);
	}

}
