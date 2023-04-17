package commands;

import ui.Console;
import ui.Human;

public class AddHuman implements Option{

    public Console console;
    public Human human;

    public AddHuman(Console console) {
        this.console = console;
    }
    @Override
    public String description() {
        return "Добавить запись о человеке";
    }

    @Override
    public void execute() {
        System.out.println("Добавляю...");


    }
    public Console getConsole() {
        return console;
    }
}
