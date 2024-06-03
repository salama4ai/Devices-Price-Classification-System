package Devices.SpringBoot.repositories.devices;


import Devices.SpringBoot.entities.devices.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
