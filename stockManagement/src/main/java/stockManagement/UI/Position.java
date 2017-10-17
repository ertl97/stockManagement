package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

/**
 * Die Klasse Position startet eine Benutzerabfrage, bei der die Position eines bestimmten Artikels
 * abgefragt wird.
 * 
 * @author Daniel
 * @version 1.0
 *
 */

public class Position {
	private static Scanner scan = new Scanner(System.in);
	private String input = "";

	public void articlePosition(){
		System.out.println("Geben Sie den Namen des gewünschten Artikels an:");
		input = scan.nextLine();

		App.getStorage().articlePosition(input);

	}
}
