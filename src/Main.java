import Model.*;
import Service.ServiceProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServiceProduct serviceProduct = new ServiceProduct();

        Product ball = new Ball("Meteora",32,50.0,true);
        Product racket = new Racket("Rayo",40,100.0,120.0,"carbono");
        Product shoe = new Shoe("Nike",20,80.0,500.0);
        Product tshirt = new Tshirt("Adidas",20,70.0,"XL");


        serviceProduct.addProduct(ball);
        serviceProduct.addProduct(racket);
        serviceProduct.addProduct(shoe);
        serviceProduct.addProduct(tshirt);


        serviceProduct.showProduct();

        serviceProduct.applyOffer(25.0);
        serviceProduct.newPrice();


    }
}