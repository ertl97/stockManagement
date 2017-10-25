package stockManagement.IUserInterface;

import java.util.Scanner;

public class ConsoleUI implements IUserInterface{
	
	@Override
	public void displayMessage(String message) {
		System.out.println(message);
	}

	@Override
	public int displayDialog(String message) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		input = scan.next();
		if(input.equals("yes")) {
			return 1;
		}
		if(input.equals("no")) {
			return 2;
		}if(input.equals("beenden")) {
			return 0;
		}
		return -1;
	}

	@Override
	public Number askForNumber() {
			Scanner scan = new Scanner(System.in);
			Number number = 0;
			System.out.println("Bitte geben Sie eine Zahl ein.");
			number = Integer.parseInt(scan.nextLine());

		return number;
	}

	@Override
	public String askForString(boolean scanWholeLine) {
			Scanner scan = new Scanner(System.in);
			String text = "";
			System.out.println("Bitte geben Sie einen Text ein.");
			if(scanWholeLine == true) {
				text = scan.nextLine();
			}else{
				text = scan.nextLine();
			}
		return text;
	}
	
	

}
