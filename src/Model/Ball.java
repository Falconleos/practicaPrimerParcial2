package Model;

import Interface.OfferProduct;

public class Ball extends Product implements OfferProduct {

    private Boolean inflate;

    public Ball() {
    }

    public Ball(String name, Integer stock, Double precio, Boolean inflate) {
        super(name, stock, precio);
        this.inflate = inflate;
    }

    public Boolean getInflate() {
        return inflate;
    }

    public void setInflate(Boolean inflate) {
        this.inflate = inflate;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Ball{" +
                "inflate=" + inflate +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrecio() * percentage;
    }

    @Override
    public Double offer(Double percentage){
        return getPrecio() * (1-percentage/100);
    }

}
