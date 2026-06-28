// RemoteControl.java - Invoker class
public class RemoteControl {
    private Command lastCommand;

    public void pressButton(Command command) {
        command.execute();
        lastCommand = command;
    }

    public void pressUndo() {
        if (lastCommand != null) {
            System.out.print("UNDO -> ");
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
