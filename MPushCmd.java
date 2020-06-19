/**
 * 
 * @author Kayla Weselowski concrete command class for music button pushed 
 * 
 */
public class MPushCmd extends Command {

	Music music;

	public MPushCmd(Music newMusic) {
		music = newMusic;
	}

	public void execute() {
		music.push();
	}

	public void undo() {
		music.push();
	};
}
