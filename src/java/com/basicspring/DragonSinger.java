package com.basicspring;

import java.io.PrintStream;

public class DragonSinger implements Singer {
    PrintStream printStream;

    public DragonSinger(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.print("Prepare the weapon to kill the dragon");
    }

    public void singAfterQuest() {
        printStream.print("The brave knight killed the dragon");

    }
}
