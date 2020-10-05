package com.mohistmc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MohistRuns {

    public static void runs() throws InterruptedException, IOException {
        String path1 = String.format("forge-1.16.3-34.1.5.jar");

        if (!Files.exists(Paths.get(path1))) {
            System.out.println("Please reload it");
        }
        else {
            ProcessBuilder builder = new ProcessBuilder();
            builder.command("java", "-jar", String.format("forge-1.16.3-34.1.5.jar"), "nogui", ".");
            builder.inheritIO();
            Process process = builder.start();
            process.waitFor();
        }
    }

    public static void delete() throws IOException {
        String log1 = String.format("forge-1.16.3-34.1.5-installer.jar.log");
        String path2 = String.format("forge-1.16.3-34.1.5-installer.jar");
            Files.deleteIfExists(Paths.get(path2));
            Files.deleteIfExists(Paths.get(log1));
    }
}
