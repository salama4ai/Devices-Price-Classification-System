package Devices.SpringBoot.services;

import Devices.SpringBoot.entities.devices.Device;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DeviceService {
    ResponseEntity<List<Device>> findAll();
    ResponseEntity<Device> findById(int id);
    //ResponseEntity<Device> create(float[] newDeviceInstanceData);

    ResponseEntity<Device> create(Float[] newDeviceInstanceData);

    ResponseEntity<Integer> predictPrice(int id);
}
