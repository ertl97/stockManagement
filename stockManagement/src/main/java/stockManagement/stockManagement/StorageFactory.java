package stockManagement.stockManagement;

import stockManagement.Data.InMemory;
import stockManagement.Data.Storage;
/**
 * Die Klasse wird zur Erstellung eines Storage Objekts verwendet.
 * @author Daniel
 *
 */
public class StorageFactory {
	
	
	/**
	 * In dieser Methode wird abgefragt welche Speicher möglichkeit man auswählt.
	 * @return Storage
	 */
	public static Storage getStorage(String storageType) {
		if(storageType == null){
			return null;
		}
		if(storageType.equalsIgnoreCase("InMemory")) {
			return new InMemory();
		}
		return null;
	}

}
