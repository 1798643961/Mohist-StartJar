package com.mohistmc;

import java.io.File;

public class MohistMc {

    public static void main(String[] args) throws Throwable {

        System.out.println("\n" + "\n" +
                " __    __   ______   __  __   __   ______   ______  \n" +
                "/\\ \"-./  \\ /\\  __ \\ /\\ \\_\\ \\ /\\ \\ /\\  ___\\ /\\__  _\\ \n" +
                "\\ \\ \\-./\\ \\\\ \\ \\/\\ \\\\ \\  __ \\\\ \\ \\\\ \\___  \\\\/_/\\ \\/ \n" +
                " \\ \\_\\ \\ \\_\\\\ \\_____\\\\ \\_\\ \\_\\\\ \\_\\\\/\\_____\\  \\ \\_\\ \n" +
                "  \\/_/  \\/_/ \\/_____/ \\/_/\\/_/ \\/_/ \\/_____/   \\/_/ \n" +
                "                                                    \n" + "\n");
        afterSetup();
        MohistRuns.delete();
        MohistRuns.runs();
    }

    protected static void afterSetup() throws Throwable {
        MohistInstaller.install();
    }
}
