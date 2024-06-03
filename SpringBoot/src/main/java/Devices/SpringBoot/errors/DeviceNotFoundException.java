package Devices.SpringBoot.errors;

public class DeviceNotFoundException extends RuntimeException {
    public DeviceNotFoundException (String message){
        super(message);
    }
}
