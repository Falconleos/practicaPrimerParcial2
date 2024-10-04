package Model;

public abstract class Equipement extends Product{

    public Equipement() {
    }

    public Equipement(String name, Integer stock, Double precio) {
        super(name, stock, precio);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Equipement{}";
    }

}
