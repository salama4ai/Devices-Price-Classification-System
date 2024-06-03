package Devices.SpringBoot.services.impl;

import Devices.SpringBoot.entities.devices.AddNewDeviceData;
import Devices.SpringBoot.entities.devices.Device;
import Devices.SpringBoot.errors.DeviceNotFoundException;
import Devices.SpringBoot.repositories.devices.DeviceRepository;
import Devices.SpringBoot.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public ResponseEntity<List<Device>> findAll() {
        List<Device> devices = this.deviceRepository.findAll();
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Device> findById(int id) {
        Optional<Device> foundedDevice = this.deviceRepository.findById(id);
        if(foundedDevice.isEmpty()){
            throw new DeviceNotFoundException("there isn't any device with id = " + id);
        };
        Device newDevice = foundedDevice.get();
        return new ResponseEntity<>(newDevice, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Device> create(AddNewDeviceData newDeviceData) {
        final AddNewDeviceData addNewDeviceData = newDeviceData;
        final Device newDevice = this.deviceRepository.save(addNewDeviceData);
        return new ResponseEntity<>(newDevice, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Integer> predictPrice(int deviceId) {
        Optional<Device> device = this.deviceRepository.findById(deviceId);
        Device predictThisDevicePrice = device.get();

        return new ResponseEntity<>(priceRange, HttpStatus.OK);
    }
}
