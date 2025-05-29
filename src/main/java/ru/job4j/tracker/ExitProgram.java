package ru.job4j.tracker;

public class ExitProgram implements UserAction {
    private final Output out;

    public ExitProgram(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Exit program ===");
        return false;
    }
}
