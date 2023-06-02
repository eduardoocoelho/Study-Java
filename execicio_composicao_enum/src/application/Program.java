package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Reading client info
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.nextLine());
		
		//Creating client object
		Client c1 = new Client(name, email, birthDate);
		
		//Reading order info
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus os1 = OrderStatus.valueOf(sc.nextLine());
		
		//Creating order object
		Order o1 = new Order(sdf2.parse("20/04/2018 11:25:09"), os1, c1);
		
		//Reading products info
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			//Creating product + orderItem object + adding item to order
			Product p = new Product(productName, productPrice);
			OrderItem item = new OrderItem(p, quantity, productPrice);
			o1.addItem(item);
		}
		
		//Printing order summary
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println("Order moment: " + sdf2.format(o1.getMoment()));
		System.out.println("Order status: " + o1.getStatus());
		System.out.println(c1.toString());
		System.out.println("Order items:");
		double sum = 0;
		for(OrderItem i : o1.getItems()) {
			System.out.println(i.getProduct().getName()+
					", $"+i.getPrice()+
					", Quantity: "+i.getQuantity()+
					", Subtotal: $"+i.subTotal());
			sum += i.subTotal();
		}
		System.out.println("Total price: $"+sum);
		
		sc.close();
	}

}
