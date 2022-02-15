package model;

import java.util.Scanner;
public class Food {
	public String Name;
	public float Price;
	
	public Food(String Name, float Price) {
		this.Name=Name;
		this.Price=Price;
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Enter Name Food");
		Name=sc.nextLine();
		try {
		System.out.println("Enter Price Food");
		Price=sc.nextFloat();
		}catch(Exception e) {
			System.out.println("Invalid choice");
			input();
		}
		System.out.println("-----------------------------------------------");
		System.out.println();
	}
	public void Payment() {
		System.out.println("Price: "+Price);
	}
	public String detail() {
		return Name+" => "+Price;
	}
	public float getPrice() {
		return Price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(Float Price) {
		this.Price=Price;
	}
}

