package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduct {

    private List<Product> inventary;

    public ServiceProduct() {
        this.inventary = new ArrayList<>();
    }

    public void addProduct(Product p){
        inventary.add(p);
    }

    public void showProduct(){

        for(Product p:inventary){
            System.out.println(p);
            System.out.println("De la instancia: " + p.getClass());
        }

    }

    public void applyOffer(Double percentage){

        for(Product p: inventary){
            Double priceWithDiscount = 0d;
            if(p instanceof Ball){
                priceWithDiscount = ((Ball) p).offer(percentage);
                System.out.println("Precio de oferta de "+p.getName()+": "+priceWithDiscount);
            }if(p instanceof Shoe){
                priceWithDiscount = ((Shoe) p).offer(percentage);
                System.out.println("Precio de oferta de "+p.getName()+": "+priceWithDiscount);
            }
        }
    }

    public void newPrice(){

        for (Product p:inventary){
            Double percentage = 0d;
            Double oldPrice = 0d;
            if(p instanceof Ball){
                percentage = 1.07;
                oldPrice = p.getPrecio();
            }if(p instanceof Racket){
                percentage = 1.12;
                oldPrice = p.getPrecio();
            }if(p instanceof Shoe){
                percentage = 1.18;
                oldPrice = p.getPrecio();
            }if(p instanceof Tshirt){
                percentage = 1.25;
                oldPrice = p.getPrecio();
            }
            p.setPrecio(p.calculatePrice(percentage));
            System.out.println("Precio anterio de "+p.getName()+": "+oldPrice+", con aumento: "+p.getPrecio());

        }

    }
}
