/**
 * 
 * @author Kayla Weselowski
 * interface for door state
 * decouples door and state
 * concrete states change behaviour of door
 */

public interface BlindState {

	public void fullyOpen();

	public void fullyClosed();

	public void up();

	public void down();

}
