package com.company.HomeWork.HomeWork_3_2_2.Vehicle;

import com.company.HomeWork.HomeWork_3_2_2.BodyType.PickupType;
import com.company.HomeWork.HomeWork_3_2_2.BodyType.SedanType;
import com.company.HomeWork.HomeWork_3_2_2.Fuel.DieselType;
import com.company.HomeWork.HomeWork_3_2_2.Fuel.PetrolType;
import com.company.HomeWork.HomeWork_3_2_2.Purpose.PassengerType;
import com.company.HomeWork.HomeWork_3_2_2.Purpose.TruckType;

public class Main {
    public static void main(String[] args) {

        AdsService adsService = new AdsService();

        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});
        System.out.println();

        adsService.filterByVehicleTypeByPurpose(new PassengerType());  //  фильтруем по типу кузова
        System.out.println();

        adsService.filterByVehicleTypeByPurpose(new TruckType());  //  фильтруем по цели использования
        System.out.println();

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());  //  фильруем по топливу
        System.out.println();


        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

    }
}