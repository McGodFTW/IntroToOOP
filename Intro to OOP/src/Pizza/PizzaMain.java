package Pizza;


import java.util.Scanner;

public class PizzaMain {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int size;
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    Pizza p3 = new Pizza();
    
    //Info for pizza 1
    System.out.println("Topping of Pizza 1");
    p1.setToppings(input.next());
    System.out.println("What is the diameter of the pizza in inches: ");
    size = input.nextInt();
    p1.setDiameter(size);
    p1.setPizzaValue(size);

    //Info for pizza 2
    System.out.println("Topping of Pizza 2");
    p2.setToppings(input.next());
    System.out.println("What is the diameter of the pizza in inches: ");
    size = input.nextInt();
    p2.setDiameter(size);
    p2.setPizzaValue(size);
   
    //Info for pizza 3
    System.out.println("Topping of Pizza 3");
    p3.setToppings(input.next());
    System.out.println("What is the diameter of the pizza in inches: ");
    size = input.nextInt();
    p3.setDiameter(size);
    p3.setPizzaValue(size);
    
    System.out.println("Pizza #1:");
    System.out.println("Topping: " + p1.getToppings());
    System.out.println("Diameter: " + p1.getDiameter());
    System.out.println("Price: " + p1.getPrice());
    System.out.println();
    
    System.out.println("Pizza #2:");
    System.out.println("Topping: " + p2.getToppings());
    System.out.println("Diameter: " + p2.getDiameter());
    System.out.println("Price: " + p2.getPrice());
    System.out.println();
   
    System.out.println("Pizza #3:");
    System.out.println("Topping: " + p3.getToppings());
    System.out.println("Diameter: " + p3.getDiameter());
    System.out.println("Price: " + p3.getPrice());
    System.out.println();


  }

}