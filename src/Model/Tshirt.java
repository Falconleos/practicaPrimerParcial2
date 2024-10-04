package Model;

public class Tshirt extends Product{

    private String size;

    public Tshirt() {
    }

    public Tshirt(String name, Integer stock, Double precio, String size) {
        super(name, stock, precio);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Tshirt{" +
                "size='" + size + '\'' +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrecio()*percentage;
    }

}
