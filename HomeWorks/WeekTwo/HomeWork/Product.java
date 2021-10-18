package HomeWork;

public class Product {
    private final String seller;

    private final String name;

    private final double price;

    public Product(String seller, String name, double price){
        this.name = name;
        this.seller = seller;
        this.price = price;
    }

    public Product(Product original){
        this.seller = original.seller;
        this.price = original.price;
        this.name = original.name;
    }

    public String getSeller(){
        return seller;
    }

    public final String getName(){
        return name;
    }

    public double getPrice(Cart cart){
        return price;
    }

    public boolean canBeReduced(){
        return true;
    }

    @Override
    public String toString(){
        return this.name + " " + this.price + " TL. Sold By " + this.seller + "\n"; 
    }
}
