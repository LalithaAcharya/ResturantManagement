package controller;
import service.ManageFood;

import java.util.*;
import utility.FileReader;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManageFood managefood=new ManageFood();
		
		FileReader filereader=new FileReader();
		filereader.read();
	
		int select;
		
		Scanner sc=new Scanner(System.in);
		do {
			Menumain();
			select=Integer.parseInt(sc.nextLine());
		
			switch(select) {
			case 1:
				do {
					MenuManageFood();
					select=Integer.parseInt(sc.nextLine());
					System.out.println("-------------------------------------------------------");
					switch(select) {
					case 1:
						managefood.add();
						System.out.println("*******************************************************");
						System.out.println("               Menu Card                ");
						System.out.println("*******************************************************");
						managefood.print();
						System.out.println("*******************************************************");
						break;
					case 2:
						System.out.println();
						System.out.println("*******************************************************");
						System.out.println("               Menu Card                ");
						System.out.println("*******************************************************");
						managefood.print();
						System.out.println("*******************************************************");
						managefood.EditFood();
						break;
					case 3:
						System.out.println();
						System.out.println("*******************************************************");
						System.out.println("               Menu Card                ");
						System.out.println("*******************************************************");
						managefood.print();
						System.out.println("*******************************************************");
						break;
					case 4:
						System.out.println();
						System.out.println("*******************************************************");
						System.out.println("               Menu Card                ");
						System.out.println("*******************************************************");
						managefood.print();
						System.out.println("*******************************************************");
						managefood.DeleteFood();
						break;
					case 5:
						managefood.PrintOrder();
						break;
					case 6:
						managefood.search();
						break;
					case 0:
						System.out.println("back");
						break;
					default:
						break;
				}
				}while(select!=0);
				break;
			case 2:
				do {
					Menuorder();
					select=Integer.parseInt(sc.nextLine());
					System.out.println("-------------------------------------------------------");
					switch(select) {
					case 1:
						System.out.println();
						System.out.println("*******************************************************");
						System.out.println("               Menu Card                ");
						System.out.println("*******************************************************");
						managefood.print();
						System.out.println("*******************************************************");
						managefood.Price();
						break;
					
					case 0:
						System.out.println("back");
						break;
					default:
						break;
				}
				}while(select!=0);
				break;
			default:
				break;
			
			}
		}while(select!=3);
		
	}
	
	static void MenuManageFood() {
		System.out.println();
		System.out.println("======================================================");
		System.out.println("                 Admin           ");
		System.out.println("====================================================== ");
		System.out.println("0. Back to menu main");
		System.out.println("1. Add food item");
		System.out.println("2. Edit food item");
		System.out.println("3. Display food item");
		System.out.println("4. delete food item");
		System.out.println("5. Display the table iformation");
		System.out.println("6. Payment details");
		System.out.println("====================================================== ");
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("select");
	}
	static void Menuorder() {
		System.out.println();
		System.out.println("======================================================");
		System.out.println("                 User           ");
		System.out.println("======================================================");
		System.out.println("0. Back to menu main");
		System.out.println("1.Print Menu food and order");
		System.out.println("======================================================");
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("select");
	}
	static void Menumain() {
		System.out.println();
		System.out.println("========================================================");
		System.out.println("               Byte-to Resturant				 ");
		System.out.println("========================================================");
		System.out.println("1. Admin");
		System.out.println("2. User");
		System.out.println("========================================================");
		System.out.println();
	}

}
