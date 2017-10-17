package stockManagement.stockManagement;

import stockManagement.Data.InMemory;
import stockManagement.Data.Storage;
import stockManagement.UI.Menue;

/**
 * Diese Klasse enthält die main Methode.
 * @author Daniel
 * @version 1.0
 */
public class App
{
	private static Storage storage = StorageFactory.getStorage("InMemory");
	private static Menue menue = new Menue();
	

	/**
	 * Main Methode.
	 * @param args not Used
	 * @return Nothing
	 */
    public static void main( String[] args )
    {
    	
    	storage.configurateSize(5,6);

    }

    /**
     * Gibt das Datenfeld storage zurück.
     * @return Storage 
     */
	public static Storage getStorage() {
		return storage;
	}
	/**
	 * Gibt das Datenfeld menue zurück.
	 * @return Menue
	 */
	public static Menue getMenue(){
		return menue;
	}
}
