package com.mohistmc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MohistInstaller {

    public static void install() throws Throwable {

        Path path = Paths.get(String.format("forge-1.16.3-34.1.5.jar"));
        if (!Files.exists(path)) {
            ExecutorService pool = Executors.newFixedThreadPool(8);
            if (!Files.exists(path)) {
                ProcessBuilder builder = new ProcessBuilder();
                builder.command("java", "-jar", String.format("forge-1.16.3-34.1.5-installer.jar"), "--installServer", ".");
                builder.inheritIO();
                Process process = builder.start();
                process.waitFor();
            }
            pool.shutdownNow();
        }

    }

}

