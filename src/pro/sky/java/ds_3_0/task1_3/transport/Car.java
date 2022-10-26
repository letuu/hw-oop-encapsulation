package pro.sky.java.ds_3_0.task1_3.transport;

import pro.sky.java.ds_3_0.task1_1.ValidationUtils;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private float  engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int placesCount;
    private boolean winterTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gearBox,
               String bodyType,
               String regNumber,
               int placesCount,
               boolean winterTires,
               Key key,
               Insurance insurance) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = productionYear >= 0 ? productionYear : 2000;
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "default");
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "default");
        this.placesCount = Math.max(placesCount, 1);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setColor(color);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }

    public void setSeasonTires() {
//        int currentMonth = LocalDate.now().getMonth().getValue();
        int currentMonth = LocalDate.now().getMonthValue();
//        this.winterTires = currentMonth <= 4 || currentMonth >= 11; //можно так записать проверку и присваивание - это булево выражение
        if (currentMonth <= 4 || currentMonth >= 11) {
            this.winterTires = true;
        } else {
            this.winterTires = false;
        }
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
//        return symbol >= '0' && symbol <= '9';
        return Character.isDigit(symbol);
    }

    //Зто не очень валидный метод, не недо его применять в жизни, это просто для скорости
    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "белый");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDefault(gearBox, "default");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "default");
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", placesCount=" + placesCount +
                ", winterTires=" + winterTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public static class Insurance {

        private final LocalDate validUntil;
        private final float cost;
        private final String number;


        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDefault(number, "default");
        }

//        public boolean isNumberValid() {
//            return number.length() == 9;
//        }

        public void isNumberValid() {
            if (number.length() == 9) {
                System.out.println("Номер страховки корректный");
            } else {
                System.out.println("Номер страховки некорректный");
            }
        }

//        public boolean isInsuranceValid() {
//            return LocalDate.now().isBefore(this.validUntil);
//        }

        public void isInsuranceValid() {
            if (this.validUntil.isBefore(LocalDate.now())) {
                System.out.println("Нужно срочно оформить новую страховку");
            }
        }
    }
}
