package command;

import command.appliances.CeilingFan;
import command.commands.CeilingFanHighCommand;
import command.commands.CeilingFanMediumCommand;
import command.commands.Command;
import command.commands.MacroCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    public void undoTest(){
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        MacroCommand macroCommand = new MacroCommand(new Command[]{ceilingFanHighCommand, ceilingFanMediumCommand});
        macroCommand.execute();
        macroCommand.undo();
        assertEquals(CeilingFan.HIGH, ceilingFan.getSpeed());
    }

    @Test
    void commandMacroTest() {
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        MacroCommand macroCommand = new MacroCommand(new Command[] {ceilingFanHighCommand, ceilingFanMediumCommand});
        macroCommand.execute();
        assertEquals(CeilingFan.MEDIUM, ceilingFan.getSpeed());
    }

}