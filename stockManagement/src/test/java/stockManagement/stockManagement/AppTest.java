package stockManagement.stockManagement;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import stockManagement.Data.InMemory;
import stockManagement.Data.Storage;


/**
 * Unit test for simple App.
 */
public class AppTest {
	private static Storage storage = new InMemory();
	private Article article = new Article("Buch",5214,4,"LieferAG",12.1);
	private Article article2 = new Article("DVD",5218,7,"LieferAG",14.1);
    
    @Test
    public void makeArticleTest() {
    	assertEquals("Buch",article.getArticleName());
    	assertEquals(5214,article.getArticleNumber());
    	assertEquals(4,article.getPackageUnit());
    	assertEquals("LieferAG",article.getDistributor());
    }
    
    @Test
    public void stockArticleTest() {
    	storage.stockArticle(article);
    	storage.stockArticle(article2);
    	assertEquals("Zeile: 0 Spalte: 0", storage.articlePosition("Buch"));
    	assertEquals("Zeile: 1 Spalte: 0", storage.articlePosition("DVD"));
    }
    
    


}
