public class Main {
    public static void main(String[] args) {
        System.out.println("=== Command Pattern Demo ===\n");

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight    = new Light("Bedroom");

        // Commands
        Command livingRoomOn  = new LightOnCommand(livingRoomLight);
        Command livingRoomOff = new LightOffCommand(livingRoomLight);
        Command bedroomOn     = new LightOnCommand(bedroomLight);
        Command bedroomOff    = new LightOffCommand(bedroomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("-- Pressing buttons --");
        remote.pressButton(livingRoomOn);
        remote.pressButton(bedroomOn);
        remote.pressButton(bedroomOff);

        System.out.println("\n-- Undo last command --");
        remote.pressUndo();

        System.out.println("\n-- Turn off living room --");
        remote.pressButton(livingRoomOff);

        System.out.println("\n-- Undo (turns living room back on) --");
        remote.pressUndo();
    }
}
