package stockManagement.stockManagement;

	/**
	 * Die Klasse Artikel beinhaltet die einzelenen Attribute eines Artikels.
	 *
	 * @author Daniel
	 * @version 1.0
	 *
	 */

public class Article {

	private String articleName;
	private int articleNumber;
	private int packageUnit;
	private String distributor;
	private double price;

	/**
	 * Der Konstruktor inizialisiert die einzelnen Datenfelder.
	 * @param articleName String
	 * @param articleNumber int
	 * @param packageUnit int
	 * @param distributor String
	 * @param price double
	 */
	public Article(String articleName, int articleNumber, int packageUnit, String distributor, double price){
		this.articleName = articleName;
		this.articleNumber = articleNumber;
		this.packageUnit = packageUnit;
		this.distributor = distributor;
		this.price = price;
	}
	
	/**
	 * Diese Methode gibt den Namen des Artikels zurück.
	 * @return articleName
	 */
	public String getArticleName() {
		return articleName;
	}

	/**
	 * Mit dieser Methode kann man einen neuen Namen in das Datenfeld eingeben.
	 * @param articleName String
	 */
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	/**
	 * Diese Methode gibt die Nummer des Artikels zurück.
	 * @return articleNumber
	 */
	public int getArticleNumber() {
		return articleNumber;
	}

	/**
	 * Mit dieser Methode kann man eine neue Artikelnummer eingeben.
	 * @param articleNumber  int
	 */
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

	/**
	 * Diese Methode gibt die Verpackungseinheit des Artikels zurück.
	 * @return packageUnit
	 */
	public int getPackageUnit() {
		return packageUnit;
	}

	/**
	 * Mit dieser Methode kann man eine neue Verpackungseinheit eingeben.
	 * @param packageUnit int
	 */
	public void setPackageUnit(int packageUnit) {
		this.packageUnit = packageUnit;
	}

	/**
	 * Diese Methode gibt den Lieferanten zurück.
	 * @return distributor
	 */
	public String getDistributor() {
		return distributor;
	}

	/**
	 * Mit dieser Methode kann man einen neuen Lieferanten eingeben.
	 * @param distributor String
	 */
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	/**
	 * Diese Methode gibt den Preis des Artikels zurück.
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mit dieser Methode kann man einen neuen Preis eingeben.
	 * @param price double
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Diese Methode gibt einen String mit allen Datenfeldern zurück.
	 * @return String
	 */
	public String toString(){
		return "Name: "+this.articleName+" Artikelnummer: "+this.articleNumber+ " Verpackungseinheit: "+this.packageUnit+" Lieferant: "
				+this.distributor+ " Preis: "+this.price;

	}

}
