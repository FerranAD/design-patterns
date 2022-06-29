package command.commands;

import command.appliances.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
        door.lightOff();
    }

    @Override
    public void undo() {
        door.lightOn();
        door.up();
    }
}
