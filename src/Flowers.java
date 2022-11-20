import java.math.BigDecimal;
import java.math.RoundingMode;

public class Flowers {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;
    public String name;
    double result;

    public Flowers (String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        if ( this.lifeSpan <=0) {
            this.lifeSpan = 3;
        } else
            this.lifeSpan = lifeSpan;
    }

    public void flowers () {
        System.out.println(name + ", цвет - " + getFlowerColor() + ", страна происхождения " + getCountry() + ", цена - " + getCost() + ", срок стояния - "+ lifeSpan);
    }

    public String getFlowerColor() {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            return flowerColor = "белый" ;
        }
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            return country = "Россия" ;
        }
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        if (cost <=0) {
            cost =1.00;
        }
       return cost;
    }

}
