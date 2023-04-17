package commands;

import ui.Console;

public class Exit implements Option {
    public Console console;

    public Exit(Console console) {
        this.console = console;
    }

    @Override
    public String description() {

        return "Закончить работу";
    }

    @Override
    public void execute() {

        getConsole().finish();
    }
    public Console getConsole() {

        return console;
    }
}