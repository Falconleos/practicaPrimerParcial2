package Model;

public class Racket extends Product{

    private Double weight;
    private String material;

    public Racket() {
    }

    public Racket(String name, Integer stock, Double precio, Double weight, String material) {
        super(name, stock, precio);
        this.weight = weight;
        this.material = material;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Racket{" +
                "weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrecio()*percentage;
    }


}
