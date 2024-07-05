package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the Pizza \n 1. Normal \n 2. Special");
        String choice = in.nextLine();
        if (choice.equals("Normal")) {
            System.out.println("Veg or NonVeg");
            NormalPizza Pizza = new NormalPizza(in.nextLine());
            System.out.println("Need extra cheese or not: ");
            boolean e1=in.nextBoolean();
            if(e1){
                Pizza.Extracheese();
            }
            System.out.println("Need extra Toppings or not: ");
            boolean e2=in.nextBoolean();
            if (e2){
                Pizza.Extratoppings();
            }
            System.out.println("The Total Bill : "+Pizza.NormalBill());
        }
        if(choice.equals("Special")){
            System.out.println("Veg or NonVeg");
            SpecialPizza Pizza=new SpecialPizza(in.nextLine());
            System.out.println("Need extra cheese or not: ");
            boolean e1=in.nextBoolean();
            if(e1){
                Pizza.Extracheese();
            }
            System.out.println("Need extra Toppings or not: ");
            boolean e2=in.nextBoolean();
            if (e2){
                Pizza.Extratoppings();
            }
            System.out.println("The Total Bill : "+Pizza.SpecialBill());

        }
    }
}
