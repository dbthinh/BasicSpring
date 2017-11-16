package com.basicspring;

import java.io.PrintStream;

public class SlayADragonQuest implements Quest {
    private PrintStream printStream;

    public SlayADragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void focus() {
        printStream.print("You must kill a blue dragon");
    }
}
