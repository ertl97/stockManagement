package stockManagement.UI;

import stockManagement.stockManagement.App;

/**
 * In dieser Klasse werden alle Artikel ausgegeben.
 * 
 * @author Daniel
 * @version 1.0
 */

public class Inventory {
	

	public void getInventory(){
		App.getStorage().inventory();
	}
}
