package Model;

public abstract class Cloth extends Product {

   private String brand;

    public Cloth() {
    }

    public Cloth(String name, Integer stock, Double precio, String brand) {
        super(name, stock, precio);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Cloth{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
