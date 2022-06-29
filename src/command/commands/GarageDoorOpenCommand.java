package command.commands;

import command.appliances.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
    }

    @Override
    public void undo() {
        door.down();
        door.lightOff();
    }
}
