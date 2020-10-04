package com.mohistmc;

import java.nio.file.Files;
import java.nio.file.Paths;

public class MohistMc {

    public static void main(String[] args) throws Throwable {

        String path1 = String.format("forge-1.16.3-34.1.5.jar");

        System.out.println("\n" + "\n" +
                " __    __   ______   __  __   __   ______   ______  \n" +
                "/\\ \"-./  \\ /\\  __ \\ /\\ \\_\\ \\ /\\ \\ /\\  ___\\ /\\__  _\\ \n" +
                "\\ \\ \\-./\\ \\\\ \\ \\/\\ \\\\ \\  __ \\\\ \\ \\\\ \\___  \\\\/_/\\ \\/ \n" +
                " \\ \\_\\ \\ \\_\\\\ \\_____\\\\ \\_\\ \\_\\\\ \\_\\\\/\\_____\\  \\ \\_\\ \n" +
                "  \\/_/  \\/_/ \\/_____/ \\/_/\\/_/ \\/_/ \\/_____/   \\/_/ \n" +
                "                                                    \n" + "\n");
        afterSetup();
        if (!Files.exists(Paths.get(path1))) {
            System.out.println("Please reload is");
        }
        else {
            ProcessBuilder builder = new ProcessBuilder();
            builder.command("java", "-jar", String.format("forge-1.16.3-34.1.5.jar"), "nogui", ".");
            builder.inheritIO();
            Process process = builder.start();
            process.waitFor();
        }

    }

    protected static void afterSetup() throws Throwable {
        MohistInstaller.install();
    }
}
