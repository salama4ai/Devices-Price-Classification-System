package Devices.SpringBoot.config;

import Devices.SpringBoot.entities.devices.Device;
import Devices.SpringBoot.repositories.devices.DeviceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static Devices.SpringBoot.entities.devices.AddNewDeviceInstance.addNewDeviceInstance;

@Configuration
public class DeviceCommandLineRunner {
    @Bean
    CommandLineRunner initDatabase(DeviceRepository deviceRepository){
        return args -> {
            //get the current working directory
            String cwd = System.getProperty("user.dir");
            // get the python directory
            Path projectpath = Paths.get(cwd).getParent();
            String csvFile = projectpath + "\\data\\test - test.csv";
                try
                {//parsing a CSV file into BufferedReader class constructor
                    BufferedReader br = new BufferedReader(new FileReader(csvFile));
                    String columnsNames = br.readLine();
                    System.out.print(columnsNames);
                    for (int i=0; i<=9; i++)
                    {
                        String[] csvRow = br.readLine().split(",");    // use comma as separator
                        String[] csvRowArray = Arrays.copyOfRange(csvRow, 1, 21);
                        Float[] deviceRow = Arrays.stream(csvRowArray).map(Float::valueOf).toArray(Float[]::new);
                        Device newDeviceInstance = addNewDeviceInstance(deviceRow);
                        deviceRepository.save(newDeviceInstance);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
        }
    }
