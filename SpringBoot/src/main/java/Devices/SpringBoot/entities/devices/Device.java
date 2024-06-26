package Devices.SpringBoot.entities.devices;

import Devices.SpringBoot.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="devices")
@Getter
@Setter
@NoArgsConstructor
public class Device extends BaseEntity {
    //public Device getNewDevice() {return version;};

    };
