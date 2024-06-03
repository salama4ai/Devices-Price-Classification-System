package Devices.SpringBoot.entities.devices;

import java.nio.file.Paths;
import java.lang.ProcessBuilder;

public class predictDevicePrice {
    String currentWorkingDirectory = Paths.get(".").toAbsolutePath().normalize().toString();
    ProcessBuilder processBuilder = new ProcessBuilder("python", ).start();
    // Run a python script
        processBuilder.command("currentWorkingDirectory//predict.py");

}
