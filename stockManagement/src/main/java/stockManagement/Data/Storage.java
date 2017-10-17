package stockManagement.Data;

import stockManagement.stockManagement.Article;

/**
 * Das Storage interface bietet die möglichkeit weitere Speichermöglichkeiten anzubinden.
 *
 * @author Daniel
 * @version 1.0
 */

public interface Storage {

	public void configurateSize(int column, int row);
	public void stockArticle(Article article);
	public void swapArticle(int string);
	public String articlePosition(String article);
	public void positionContent(int column, int row);
	public void inventory();

}
