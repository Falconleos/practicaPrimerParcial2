package Model;

public abstract class Product {
    protected static Integer contador=0;
    private Integer id;
    private String name;
    private Integer stock;
    private Double precio;

    public Product() {
        this.id = contador++;
    }

    public Product(String name, Integer stock, Double precio) {
        this.id = contador++;
        this.name = name;
        this.stock = stock;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }

    public abstract Double calculatePrice(Double percentage);

}
