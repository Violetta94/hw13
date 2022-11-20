package transport;

import java.util.regex.Pattern;

public class Car {

    private  String brand; //
    private  String model; //
    private float engineVolume;
    private String color;
    private int year; //
    private String country; //
    private String transmission;
    private String bodyType; //
    private String registrationNumber;
    private int seatCount; //
    private boolean summerTires;


    public Car(String brand, String model, float engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int seatCount) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatCount = seatCount;
    }

    public String validateRegistrationNumber (String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else  {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }

    public void tires () {
        setSummerTires(!this.summerTires);
    }

    public void prez() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear()  + "года выпуска. Сборка в " + getCountry() + ", " + getColor() + " цвета. Объем двигателя - " + getEngineVolume() + " л." );
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        return model;
    }

    public float getEngineVolume() {
        if (engineVolume <=0) {
            engineVolume=1.5f;
        }
        return engineVolume;
    }

    public String getColor() {
        if (color == null || color.isEmpty() || color.isBlank()){
            color = "white";
        }
        return color;
    }

    public int getYear() {
        if (year <=1900) {
            year=2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        }
        return country;
    }

    public String getTransmission() {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "default";
        }
        return transmission;
    }

    public String getBodyType() {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        }
        return bodyType;
    }

    public String getRegistrationNumber() {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        }
        return registrationNumber;
    }

    public int getSeatCount() {
        if (seatCount <=0 ) {
            seatCount = 4;
        }
        return seatCount;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public class Key {
        private final String remoteStar;
        private final String keylessAccess;

        public Key(String remoteStar, String keylessAccess) {
            this.remoteStar = remoteStar;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStar='" + remoteStar + '\'' +
                    ", keylessAccess='" + keylessAccess + '\'' +
                    '}';
        }
    }
}


