package com.company.HomeWork.HomeWork_3_2_2.BodyType;

import com.company.HomeWork.HomeWork_3_2_2.Vehicle.VehicleTypeEnum;

public class PickupType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
