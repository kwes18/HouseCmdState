/**
 * 
 * @author Kayla Weselowski concrete state for music context set state to
 *         current state states print msgs
 */
public class MusicPause implements MusicState{

	Music music;
	
	public MusicPause(Music newMusic) {
		music = newMusic;
	}

	@Override
	public void push() {
		System.out.println("...music is playing.");
		music.setState(music.getPlayState());
	}
	
	public String toString() {
		return "paused";
	}
}
