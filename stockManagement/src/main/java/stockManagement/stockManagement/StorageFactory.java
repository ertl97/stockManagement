package stockManagement.stockManagement;

import stockManagement.Data.InMemory;
import stockManagement.Data.Storage;

public class StorageFactory {
	
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
