package stockManagement.stockManagement;

import stockManagement.Data.InMemory;
import stockManagement.Data.Storage;
import stockManagement.UI.Menue;

/**
 * Hello world!
 *
 */
public class App
{
	private static Storage storage = new InMemory();
	private static Menue menue = new Menue();

    public static void main( String[] args )
    {
    	storage.configurateSize(5,6);

    }


	public static Storage getStorage() {
		return storage;
	}

	public static Menue getMenue(){
		return menue;
	}
}
