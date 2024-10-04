package Model;

import Interface.OfferProduct;

public class Shoe extends Product implements OfferProduct {

    private Double weight;

    public Shoe() {
    }

    public Shoe(String name, Integer stock, Double precio, Double weight) {
        super(name, stock, precio);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Shoe{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrecio()*percentage;
    }

    @Override
    public Double offer(Double percentage){
        return getPrecio() * (1-percentage/100);
    }

}
