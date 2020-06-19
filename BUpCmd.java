/*
 * @author Kayla Weselowski
 * command class for blinds up 
 * passes up msg to door obj (receiver)
 */
public class BUpCmd extends Command {

	Blind blind;

	public BUpCmd(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void execute() {
		blind.up();
	}

	@Override
	public void undo() {
		blind.up();

	}

}
