package WeekTwo.HomeWork;

public class DiscountedProduct extends Product {
    private final Product original;

    private final double discount;

    public DiscountedProduct(Product original, double discount) {
        super(original);

        if(original.canBeReduced()==false){
            System.out.println("Price can not be reduced!");
            //System.exit(1);
            throw new IllegalArgumentException("Error!");
        }
        else{
            this.original = original;
            this.discount = discount;
        }

    }

    public double getPrice(Cart cart) {
        // code here
        double firstPrice = this.original.getPrice(cart);
        double discountedValue = (this.original.getPrice(cart)) * ((this.discount)/100);
        return firstPrice - discountedValue;

    }

    public String toString() {
        // code here

        return this.original.getName() + " [discounted " + this.discount + " %]" + this.original.toString();
    }
}
