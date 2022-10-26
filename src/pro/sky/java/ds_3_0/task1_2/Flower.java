package pro.sky.java.ds_3_0.task1_2;

import pro.sky.java.ds_3_0.task1_1.ValidationUtils;

public class Flower {

    private String flowerName;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, float cost, int lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = ValidationUtils.validOrDefault(flowerName, "rose");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Россия");
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan >0 ? lifeSpan : 3;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
