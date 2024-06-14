package Devices.SpringBoot.controllers.devices;

import Devices.SpringBoot.entities.devices.Device;
import Devices.SpringBoot.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    // Retrieve a list of all devices
    @PostMapping("devices/")
    public ResponseEntity<List<Device>> getAllDevices(){
        return this.deviceService.findAll();
    }

    // Retrieve details of a specific device by ID.
    @GetMapping(path="devices/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable int id){
        return deviceService.findById(id);
    }

    // Add a new device.
    @PostMapping("devices")
    public ResponseEntity<Device> addANewDevice(@RequestBody Float[] newDeviceInstanceData){
        return this.deviceService.create(newDeviceInstanceData);
    }


    // call the Python API to predict the price, and save the result in the device entity
    @PostMapping("predict/{deviceId}")
    public ResponseEntity<Integer> predictPrice(@PathVariable int deviceId){
        return this.deviceService.predictPrice(deviceId);
    }
}
