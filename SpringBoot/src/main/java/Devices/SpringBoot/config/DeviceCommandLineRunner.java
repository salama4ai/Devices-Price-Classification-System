package Devices.SpringBoot.config;

import Devices.SpringBoot.entities.devices.AddNewDeviceData;
import Devices.SpringBoot.repositories.devices.DeviceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.IntStream;

@Configuration
public class DeviceCommandLineRunner {
    @Bean
    CommandLineRunner initDatabase(DeviceRepository deviceRepository){
        return args -> {
            IntStream.rangeClosed(1, 10).forEach(i -> {
                AddNewDeviceData addNewDeviceData = new AddNewDeviceData(

                );
            });
        };
    }
}
