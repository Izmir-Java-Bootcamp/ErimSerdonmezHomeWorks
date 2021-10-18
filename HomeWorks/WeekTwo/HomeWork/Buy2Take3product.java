package HomeWork;

public class Buy2Take3product extends Product {
    private final Product original;

    public Buy2Take3product(Product original){
        super(original);

        if(original.canBeReduced() == false){
            System.out.println("Price can't be reduced");
            throw new IllegalArgumentException("Error");
        }else{
            this.original = original;
        }
    }

    public boolean canBeReduced(){
        boolean flag;
        if(this.original instanceof DiscountedProduct){
            flag = false;
        }else{
            flag = true;
        }
        return flag;
    }

    public double getPrice(Cart cart){
        double finalPrice = 0;
        int sameProducts = 0;
        for(int i = 0; i < cart.getProducts().size(); i++){
            if(cart.getProducts().get(i).getName().equals(this.original.getName())){
                sameProducts++;
            }
        }
        int division = sameProducts / 3;
        
        if(division > 0 ){
            int subs = sameProducts - division;

            double totalPrice = subs * this.original.getPrice(cart);

            finalPrice = totalPrice / sameProducts;
        }

        return finalPrice;
    }

}
