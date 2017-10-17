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

	public Article(String articleName, int articleNumber, int packageUnit, String distributor, double price){
		this.articleName = articleName;
		this.articleNumber = articleNumber;
		this.packageUnit = packageUnit;
		this.distributor = distributor;
		this.price = price;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

	public int getPackageUnit() {
		return packageUnit;
	}

	public void setPackageUnit(int packageUnit) {
		this.packageUnit = packageUnit;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString(){
		return "Name: "+this.articleName+" Artikelnummer: "+this.articleNumber+ " Verpackungseinheit: "+this.packageUnit+" Lieferant: "
				+this.distributor+ " Preis: "+this.price;

	}

}
