package Devices.SpringBoot.entities.devices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder;
import java.nio.file.Path;
import java.nio.file.Paths;

public class predictDevicePrice {
    public static PredictPrice Integer{
        try {
            //get the current working directory
            String cwd = System.getProperty("user.dir");
            // get the python directory
            Path projectpath = Paths.get(cwd).getParent().getParent().getParent().getParent().getParent().getParent().getParent();
            // initialize builder
            ProcessBuilder builder = new ProcessBuilder("python", projectpath+"scripts\\predict_price_range_func.py", addNewDeviceData).start();
            // Run a python script
            Process process = builder.start();
            //processBuilder.command("currentWorkingDirectory//predict.py");
            // read the python file output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int predictedPrice = reader.read();
            return predictedPrice;
        } catch (IOException e) {
            throw new RuntimeException(e);
        };
    };
};
