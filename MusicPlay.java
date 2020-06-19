/**
 * 
 * @author Kayla Weselowski concrete state for music context set state to
 *         current state states print msgs
 */
public class MusicPlay implements MusicState{

	Music music;
	
	public MusicPlay(Music newMusic) {
		music = newMusic;
	}

	@Override
	public void push() {
		System.out.println("...music is paused.");
		music.setState(music.getPauseState());
	}
	
	public String toString() {
		return "playing";
	}
}
