package pro.sky.java.ds_3_0.task1_3.transport;

import java.time.LocalDate;

public class HwOop221 {
    public static void main(String[] args) {

        Car.Key remoteEngineStart = new Car.Key(true, false);
        Car.Key remoteEngineStart_KeylessEntry = new Car.Key(true, true);
        Car.Key keylessEntry = new Car.Key(false, true);
        Car.Key no_RemoteEngineStart_KeylessEntry = new Car.Key(false, false);

        System.out.println(LocalDate.now());
        Car.Insurance one = new Car.Insurance(LocalDate.of( 2022 , 10 , 25 ), 1000f, "12345678910");

        Car lada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car defaultCar = new Car(null, null, 0f, null, 0, null, "механика", "седан", "а555рр777", 5, false, remoteEngineStart, one);


        System.out.println();
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();
        System.out.println(defaultCar);

        defaultCar.setWinterTires(true);
        System.out.println(defaultCar);
        defaultCar.setSeasonTires();
        System.out.println(defaultCar);
        System.out.println();

        System.out.println(defaultCar.getRegNumber());
        System.out.println(defaultCar.isRegNumberValid());
        defaultCar.setRegNumber("А555РР777");
        System.out.println(defaultCar.getRegNumber());
        System.out.println(defaultCar.isRegNumberValid());
        System.out.println();

        System.out.println("Удаленный запуск двигателя у audi: " + audi.getKey().isRemoteEngineStart());
        System.out.println("Бесключевой доступ у audi: " + audi.getKey().isKeylessEntry());

        System.out.println();
        audi.getInsurance().isNumberValid();
        audi.getInsurance().isInsuranceValid();


    }
}
