package com.company.HomeWork.HomeWork_3_2_2.Purpose;

import com.company.HomeWork.HomeWork_3_2_2.Vehicle.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}

