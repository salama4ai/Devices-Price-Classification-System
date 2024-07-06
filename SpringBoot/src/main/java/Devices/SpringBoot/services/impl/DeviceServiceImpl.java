package Devices.SpringBoot.services.impl;

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

import static Devices.SpringBoot.entities.devices.AddNewDeviceInstance.addNewDeviceInstance;


@Service
public class DeviceServiceImpl implements DeviceService {
    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    };

    @Override
    public ResponseEntity<List<Device>> findAll() {
        List<Device> devices = this.deviceRepository.findAll();
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Device> findById(int id) {
        Optional<Device> foundedDevice = this.deviceRepository.findById(id);
        if(foundedDevice.isEmpty()){
            throw new DeviceNotFoundException("device with that id is not exists");
        };
        Device device = foundedDevice.get();
        return new ResponseEntity<>(device, HttpStatus.OK);
    };

    @Override
    public ResponseEntity<Device> create(Float[] newDeviceInstanceData) {
        Device newDeviceCreated = this.deviceRepository.save(
                addNewDeviceInstance(newDeviceInstanceData));
        return new ResponseEntity<>(newDeviceCreated, HttpStatus.CREATED);
    };

    @Override
    public ResponseEntity<Integer> predictPrice(int deviceId) {
        Optional<Device> foundedDevice = this.deviceRepository.findById(deviceId);
        if(foundedDevice.isEmpty()){
            throw new DeviceNotFoundException("device with that id is not exists");};
        int priceRange = foundedDevice.get().z_price_range;
        return new ResponseEntity<>(priceRange, HttpStatus.OK);
    }
};