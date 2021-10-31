package WeekTwo.HomeWork;

import java.util.Scanner;

public class Main {
    public static void askCustomer(Cart cart) {

        Scanner datas = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to buy some product enter 1, If you do not please enter 0");
            int user = datas.nextInt();

            if (user == 0) {
                System.out.println(cart.toString());
                System.out.println("In total you have to pay " + cart.totalPrice() + " TL.");
                break;
            } else {
                System.out.println("What's the product name: ");
                String pName = datas.nextLine();

                System.out.println("What's the seller's name: ");
                String seller = datas.nextLine();

                System.out.println("What's the product or products price: ");
                double price = datas.nextDouble();
                datas.nextLine();

                System.out.println("How many products do you want to buy: ");
                int numberOfProduct = datas.nextInt();

                System.out.println(
                        "Is there any discount on your product if there is please enter the amount, if not enter 0 ?");
                double userSelection_D = datas.nextDouble();
                datas.nextLine();

                System.out.println("Does product have buy2Take3 advantage? (y)(n)");
                String userSelection_B = datas.nextLine();

                Product product = new Product(seller, pName, price);

                if (userSelection_D > 0 && userSelection_B.equals("y")) {
                    System.out.println("Please choose one option!!!");
                }
                if (userSelection_D != 0 && userSelection_B.equals("n")) {
                    Product p = new DiscountedProduct(product, userSelection_D);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }

                if (userSelection_B.equals("y") && (userSelection_D == 0)) {
                    Product p = new Buy2Take3product(product);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }
                cart.addProduct(product, numberOfProduct);
            }
        }
        datas.close();

    }

    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        Scanner scanner = new Scanner(System.in);

        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options:");
        System.out.println("");

        Cart cart = new Cart();
        askCustomer(cart);
        scanner.close();
    }

}
