/**
 * 
 * @author Kayla Weselowski
 * concrete command class for blinds down
 *
 */
public class BDownCmd extends Command {

	Blind blind;

	public BDownCmd(Blind newBlind) {
		blind = newBlind;
	}

	@Override
	public void execute() {
		blind.down();
	}

	@Override
	public void undo() {
		blind.down();

	}
}
