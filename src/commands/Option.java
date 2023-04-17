package commands;

import ui.Console;

public interface Option {
    String description();
    void execute();
    Console getConsole();
}