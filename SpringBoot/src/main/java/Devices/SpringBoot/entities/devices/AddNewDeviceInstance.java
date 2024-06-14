package Devices.SpringBoot.entities.devices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.lang.ProcessBuilder;


public class AddNewDeviceInstance {

    //@Override
    public static Device addNewDeviceInstance(Float[] newDeviceInstanceData){
        Device newDeviceInstance = new Device();
        //newDeviceInstance.id = (int)newDeviceInstanceData[0];
        newDeviceInstance.battery_power = (int)Math.floor(newDeviceInstanceData[0]);
        newDeviceInstance.blue = (int)Math.floor(newDeviceInstanceData[1]);
        newDeviceInstance.clock_speed = newDeviceInstanceData[2];
        newDeviceInstance.dual_sim = (int)Math.floor(newDeviceInstanceData[3]);
        newDeviceInstance.fc = (int)Math.floor(newDeviceInstanceData[4]);
        newDeviceInstance.four_g = (int)Math.floor(newDeviceInstanceData[5]);
        newDeviceInstance.int_memory = (int)Math.floor(newDeviceInstanceData[6]);
        newDeviceInstance.m_dep = newDeviceInstanceData[7];
        newDeviceInstance.mobile_wt = (int)Math.floor(newDeviceInstanceData[8]);
        newDeviceInstance.n_cores = (int)Math.floor(newDeviceInstanceData[9]);
        newDeviceInstance.pc = (int)Math.floor(newDeviceInstanceData[10]);
        newDeviceInstance.px_height = (int)Math.floor(newDeviceInstanceData[11]);
        newDeviceInstance.px_width = (int)Math.floor(newDeviceInstanceData[12]);
        newDeviceInstance.ram = (int)Math.floor(newDeviceInstanceData[13]);
        newDeviceInstance.sc_h = (int)Math.floor(newDeviceInstanceData[14]);
        newDeviceInstance.sc_w = (int)Math.floor(newDeviceInstanceData[15]);
        newDeviceInstance.talk_time = (int)Math.floor(newDeviceInstanceData[16]);
        newDeviceInstance.three_g = (int)Math.floor(newDeviceInstanceData[17]);
        newDeviceInstance.touch_screen = (int)Math.floor(newDeviceInstanceData[18]);
        newDeviceInstance.wifi = (int)Math.floor(newDeviceInstanceData[19]);
        newDeviceInstance.price_range = predictDevicePrice(newDeviceInstanceData);
        return newDeviceInstance;
    }

    private static Integer predictDevicePrice(Float[] newDeviceInstanceData) {
        try {
            //get the current working directory
            String cwd = System.getProperty("user.dir");
            // get the python directory
            Path projectpath = Paths.get(cwd).getParent();
            // convert array of floats into separate strings
            String predictThisDeviceInstancePrice = String.join(",", Arrays.toString(newDeviceInstanceData));
            // initialize builder
            ProcessBuilder builder = new ProcessBuilder("python",
                    projectpath + "\\scripts\\predict_price_range_func.py",
                    predictThisDeviceInstancePrice);
            // Run a python script
            Process process = builder.start();
            //processBuilder.command("currentWorkingDirectory//predict.py");
            // read the python file output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return Integer.valueOf(reader.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
