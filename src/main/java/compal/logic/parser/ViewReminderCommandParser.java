package compal.logic.parser;

import compal.logic.command.Command;
import compal.logic.command.ViewReminderCommand;
import compal.logic.parser.exceptions.ParserException;

public class ViewReminderCommandParser implements CommandParser {

    @Override
    public Command parseCommand(String restOfInput) throws ParserException {
        return new ViewReminderCommand();
    }
}