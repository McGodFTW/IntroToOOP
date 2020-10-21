package VideoGames;

import java.util.Scanner;

public class VGMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VideoGames v1 = new VideoGames();
		VideoGames v2 = new VideoGames();
		VideoGames v3 = new VideoGames();
		VideoGames v4 = new VideoGames();
		VideoGames v5 = new VideoGames();
		
		System.out.println("Enter Game Title: ");
		v1.setTitle(input.next());
		System.out.println("Enter Game Rating: ");
		v1.setRating(input.next());
		System.out.println("Enter Game Console: ");
		v1.setConsole(input.next());
		System.out.println("Enter Price: ");
		v1.setPrice(input.nextDouble());
		System.out.println("Enter Quantity: ");
		v1.setQuantity(input.nextInt());
		
		System.out.println("Enter Game Title: ");
		v2.setTitle(input.next());
		System.out.println("Enter Game Rating: ");
		v2.setRating(input.next());
		System.out.println("Enter Game Console: ");
		v2.setConsole(input.next());
		System.out.println("Enter Price: ");
		v2.setPrice(input.nextDouble());
		System.out.println("Enter Quantity: ");
		v2.setQuantity(input.nextInt());
		
		System.out.println("Enter Game Title: ");
		v3.setTitle(input.next());
		System.out.println("Enter Game Rating: ");
		v3.setRating(input.next());
		System.out.println("Enter Game Console: ");
		v3.setConsole(input.next());
		System.out.println("Enter Price: ");
		v3.setPrice(input.nextDouble());
		System.out.println("Enter Quantity: ");
		v3.setQuantity(input.nextInt());
		
		System.out.println("Enter Game Title: ");
		v4.setTitle(input.next());
		System.out.println("Enter Game Rating: ");
		v4.setRating(input.next());
		System.out.println("Enter Game Console: ");
		v4.setConsole(input.next());
		System.out.println("Enter Price: ");
		v4.setPrice(input.nextDouble());
		System.out.println("Enter Quantity: ");
		v4.setQuantity(input.nextInt());
		
		System.out.println("Enter Game Title: ");
		v5.setTitle(input.next());
		System.out.println("Enter Game Rating: ");
		v5.setRating(input.next());
		System.out.println("Enter Game Console: ");
		v5.setConsole(input.next());
		System.out.println("Enter Price: ");
		v5.setPrice(input.nextDouble());
		System.out.println("Enter Quantity: ");
		v5.setQuantity(input.nextInt());
		
		
		
		
		
		
		
		
		System.out.println("Game\t\tTitle\t\tConsole\t\tRating\t\tPrice\t\tQuantity");
		
		System.out.print("1\t\t");
		System.out.print(v1.getTitle() + "\t\t");
		System.out.print(v1.getConsole() + "\t\t");
		System.out.print(v1.getRating() + "\t\t");
		System.out.print(v1.getPrice() + "\t\t");
		System.out.print(v1.getQuantity() + "\t\t");
		System.out.println();
		
		System.out.print("2\t\t");
		System.out.print(v2.getTitle() + "\t\t");
		System.out.print(v2.getConsole() + "\t\t");
		System.out.print(v2.getRating() + "\t\t");
		System.out.print(v2.getPrice() + "\t\t");
		System.out.print(v2.getQuantity() + "\t\t");
		System.out.println();

		System.out.print("3\t\t");
		System.out.print(v3.getTitle() + "\t\t");
		System.out.print(v3.getConsole() + "\t\t");
		System.out.print(v3.getRating() + "\t\t");
		System.out.print(v3.getPrice() + "\t\t");
		System.out.print(v3.getQuantity() + "\t\t");
		System.out.println();
		
		System.out.print("4\t\t");
		System.out.print(v4.getTitle() + "\t\t");
		System.out.print(v4.getConsole() + "\t\t");
		System.out.print(v4.getRating() + "\t\t");
		System.out.print(v4.getPrice() + "\t\t");
		System.out.print(v4.getQuantity() + "\t\t");
		System.out.println();
		
		System.out.print("5\t\t");
		System.out.print(v5.getTitle() + "\t\t");
		System.out.print(v5.getConsole() + "\t\t");
		System.out.print(v5.getRating() + "\t\t");
		System.out.print(v5.getPrice() + "\t\t");
		System.out.print(v5.getQuantity() + "\t\t");
		System.out.println();


	}

}
