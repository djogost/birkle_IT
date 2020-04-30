package org.example.validation;

import org.example.util.VehicleDTO;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VehicleValidator implements ConstraintValidator<ValidVehicleRequest, VehicleDTO> {
   public void initialize(ValidVehicleRequest constraint) {
   }

   public boolean isValid(VehicleDTO vehicleDTO, ConstraintValidatorContext context) {
      return validateEmptyFields(vehicleDTO, context);
   }

   boolean validateEmptyFields(VehicleDTO vehicleDTO, ConstraintValidatorContext context){
      if( StringUtils.isBlank(vehicleDTO.getModel()) ||
              StringUtils.isBlank(vehicleDTO.getVehicleType()) ||
              StringUtils.isBlank(vehicleDTO.getPlateCountrey()) ||
              StringUtils.isBlank(vehicleDTO.getPlateNumber()) ||
              StringUtils.isBlank(vehicleDTO.getVin()) ||
              StringUtils.isBlank(vehicleDTO.getManifacturedCountry())
      ){
         context.buildConstraintViolationWithTemplate("\"Form parameters are mandatory \"")
                 .addPropertyNode("subject")
                 .addPropertyNode("model")
                 .addPropertyNode("vehicleType")
                 .addPropertyNode("plateCountrey")
                 .addPropertyNode("plateNumber")
                 .addPropertyNode("vin")
                 .addPropertyNode("manifacturedCountry")
                 .addConstraintViolation();
         return false;
      }
      return true;
   }
}
