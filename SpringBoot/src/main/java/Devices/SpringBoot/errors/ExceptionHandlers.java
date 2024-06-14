package Devices.SpringBoot.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DeviceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public final ResponseEntity<ErrorResponse> handleDeviceNotFoundException(final ErrorResponse DeviceNotFoundException){
        ErrorResponse errorResponse = new ErrorResponse("404", "there isn't any device with that id");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    };
};
