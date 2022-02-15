package service;
import java.util.*;

import model.Food;
public class ManageFood {
	ArrayList<Food> foodlist=new ArrayList<Food>();
	/*Food list1=new Food("dosa",100);
	Food list2=new Food("rotti",50);
	Food list3=new Food("puri",40);
	Food list4=new Food("parota",45);*/
	ArrayList<GuestsOrder> guestsorder=new ArrayList<>();
	Food Food;
	public GuestsOrder  GuestsOrder;
	public int SelectFood;
	/*void items() {
		foodlist.add(list1);
		foodlist.add(list2);
		foodlist.add(list3);
		foodlist.add(list4);
		}*/
	Scanner sc=new Scanner(System.in);
	public void add() {
		System.out.println();
		System.out.println("..............................................................");
		try {
		System.out.println("Enter the number of Food items that to want to add in menu");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("..............................................................");
		for(int i=0;i<n;i++) {
			Food food=new Food(null, i);
			food.input();
			foodlist.add(food);
		}
		}catch(Exception e) {
			System.out.println("Invalid choice");
			add();
		}
	}
	public void print() {
		//items();
		for(int i=0;i<foodlist.size();i++) {
			System.out.println((i+1)+". |  "+foodlist.get(i).detail()+"	|");
		}
	}
	public void Price() {
		float PriceFood=0;
		float Totalpayment=0;
		int number;
		GuestsOrder guest=new GuestsOrder();
		guest.input();
		guestsorder.add(guest);
		for(int i=0;i<10;i++) {
			System.out.println("Select Food"+(i+1));
			SelectFood=sc.nextInt();
			System.out.println("--------------------------------------------");
			System.out.println();
			if(SelectFood==0) {
				guest.setTablepayment(Totalpayment);
				System.out.println("****************************************************");
				System.out.println("Total payment");
				System.out.println(Totalpayment);
				System.out.println("--------------------------------------------");
				System.out.println("Thank you, see you again");
				System.out.println("****************************************************");
				System.out.println();
				break;
			}else {
				System.out.println();
				System.out.println("..............................................................");
				System.out.println("Please enter the Quantity of the selected food item:");
				number=sc.nextInt();
				System.out.println("..............................................................");
				Food food=foodlist.get(SelectFood-1);
				guest.setEatList(food);
				PriceFood =food.Price*number;
			}
			Totalpayment+=PriceFood;
			System.out.println();
			System.out.println("****************************************************");
			System.out.println("Your order is successfull");
			System.out.println("Payment "+(i+1)+" is: ");
			System.out.println(" "+PriceFood);
			System.out.println();
			System.out.println("****************************************************");
			System.out.println("Order finished! Please do enter 0");
			System.out.println("else");
		}
	}
	public void PrintOrder() {
		for(int i=0;i<guestsorder.size();i++) {
			guestsorder.get(i).print();
		}
	}
	public void search() {
		Scanner sc=new Scanner(System.in);
		String idtable;
		int up=1;
		System.out.println();
		System.out.println("..............................................................");
		System.out.println("Enter table number payment: ");
		idtable=sc.nextLine();
		System.out.println("..............................................................");
		for(int i=0;i<guestsorder.size();i++) {
			if(guestsorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
				guestsorder.get(i).print();
			}
		}
		if(up==0) {
			System.out.println("No table number "+idtable);
		}
	}
	public String EditName() {
		System.out.println("Enter the name of the food to edit: ");
		return sc.nextLine();
	}
	public float EditPrice() {
		System.out.println("Enter the price to edit: ");
		return sc.nextFloat();
	}
	public void EditFood() {
		String namefood;
		int up=0;
		System.out.println();
		System.out.println("..............................................................");
		System.out.println("Enter the name of the food to fix");
		namefood=sc.nextLine();
		System.out.println("..............................................................");
		for(int i=0;i<foodlist.size();i++) {
			if(foodlist.get(i).getName().equals(namefood)) {
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				System.out.println("You have successfully updated the food.");
				break;
			}
		}if(up==0) {
			System.out.println("Enterd food is not available "+namefood);
		}
	}
	public void DeleteFood() {
		String deletefood;
		int up=0;
		System.out.println("Enter the name of the food to delete");
		deletefood=sc.nextLine();
		deletefood=sc.nextLine();
		for(int i=0;i<foodlist.size();i++) {
			if(foodlist.get(i).getName().equals(deletefood)) {
				up++;
				foodlist.remove(i);
				System.out.println("delete finish");
				break;
			}
		}if(up==0) {
			System.out.println("no food name is "+deletefood);
		}
	}
}

