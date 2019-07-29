package lab6.command;

public interface Command {
	public void execute(int unit);
	public void undo();
}
