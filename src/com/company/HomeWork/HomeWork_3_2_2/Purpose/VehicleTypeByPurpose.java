package com.company.HomeWork.HomeWork_3_2_2.Purpose;

import com.company.HomeWork.HomeWork_3_2_2.Vehicle.VehicleType;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose() {
        super(" по назначению");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}