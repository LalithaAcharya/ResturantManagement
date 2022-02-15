package service;
import java.util.*;

import model.Food;
public class GuestsOrder {
	
	public String IdTable;
	ArrayList<Food> EatList=new ArrayList<Food>();
	public float TotalPayment;
	
	public String getIdTable() {
		return IdTable;
	}
	public void setEatList(Food food) {
		EatList.add(food);
	}
	public void setTablepayment(float TotalPayment) {
		this.TotalPayment=TotalPayment;
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("..............................................................");
		System.out.println("Please select your table: ");
		IdTable=sc.nextLine();
		System.out.println("..............................................................");
		System.out.println();
		System.out.println("..............................................................");
	}
	public void print() {
		System.out.println();
		System.out.println("**************************************************************");
		System.out.println("                  Table Information                  ");
		System.out.println("**************************************************************");
		System.out.println("Table Number: "+this.IdTable);
		System.out.println("--------------------------------------------");
		System.out.println("Total payment:"+this.TotalPayment);
		System.out.println("--------------------------------------------");
		System.out.println("Selected Food is ");
		for(Food m:this.EatList) {
			System.out.println("=>"+m.Name);
		}
		System.out.println("**************************************************************");
		System.out.println();
	}
}
	


