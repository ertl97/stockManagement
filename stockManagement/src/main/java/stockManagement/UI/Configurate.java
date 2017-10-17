package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

public class Configurate {

	private static Scanner scan = new Scanner(System.in);
	private int input = 0;

	public void configurateSize(){
		int column;
		int row;
		System.out.println("Geben Sie eine Spaltenzahl ein:");
		column = Integer.parseInt(scan.nextLine());
		System.out.println("Geben Sie eine Zeilenzahl ein:");
		row = Integer.parseInt(scan.nextLine());

		App.getStorage().configurateSize(column, row);
		
	}
}
