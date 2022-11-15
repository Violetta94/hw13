public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand,String model , float engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void prez() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear()  + "года выпуска. Сборка в " + getCountry() + ", " + getColor() + " цвета. Объем двигателя - " + getEngineVolume() + " л." );
    }

    public String getBrand() {
        if (brand == null || brand == "") {
            brand = "default";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model == "") {
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
        if (color == null || color == "") {
            color = "white";
        }
        return color;
    }

    public int getYear() {
        if (year <=0) {
            year=2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null || country == "") {
            country = "default";
        }
        return country;
    }
}
