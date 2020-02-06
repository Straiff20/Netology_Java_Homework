package com.company.HomeWork.HomeWork_3_2_2.Fuel;

import com.company.HomeWork.HomeWork_3_2_2.Vehicle.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
