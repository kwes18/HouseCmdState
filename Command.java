
/*
 * @author Kayla Weselowski 3043975
 * Now an abstract class to implement Cloneable interface
 * methods can now have bodies... use for clone()
 */

public abstract class Command implements Cloneable{
	public void execute() {
	}
	public void undo() {
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
