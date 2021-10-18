package HomeWork;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private final List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addProducts(List<Product> products){
        for(Product product: products){
            this.addProduct(product);
        }
    }

    public void addProduct(Product product, int howManyTimes){
        for(int i = 0; i < howManyTimes; i++){
            this.products.add(product);
        }
    }

    public double totalPrice(){
        int totalPrice = 0;

        for(Product p : this.products){
            totalPrice += p.getPrice(this);
        }

        return totalPrice;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < products.size(); i++){
            Product product = products.get(i);
            result += product.toString() + " " + product.getPrice(this)+ " TL. Sold By " + product.getSeller() + "\n";
        }
        return result;
    }
}
