package commands;

import ui.Console;
import ui.Human;


public class DelHuman implements Option {
    public Console console;
    public Human human;

    public DelHuman(Console console) {
        this.console = console;
    }
    @Override
    public String description() {
        return "Удалить запись";
    }

    @Override
    public void execute() {

        System.out.println("Удаляю...");
    }
    public Console getConsole() {
        return console;
    }
}
