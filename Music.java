

public class Music {
	private String musicName;
	MusicState playState;
	MusicState pauseState;

	MusicState state;

	public Music(String name) {
		musicName = name;
		
		pauseState = new MusicPause(this);
		playState = new MusicPlay(this);
		state = pauseState;
	}

	public void push() {
		state.push();
	}

	//sets new state of music
	public void setState(MusicState newState) {
		state = newState;
	}

	//returns current state
	public MusicState getState() {
		return state;
	}

	public MusicState getPlayState() {
		return playState;
	}

	public MusicState getPauseState() {
		return pauseState;
	}

	//displays name of music and current state
	public String toString() {
		return musicName + " is " + state.toString();
	}

}
