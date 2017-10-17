package stockManagement.Data;

import java.util.Arrays;

import stockManagement.stockManagement.Article;

/**
 * Die klasse InMemory implementiert das Interface Storage und dient zur Speicherung der Artikel
 * in einem 2D Array.
 *
 * @author Daniel
 * @version 1.0
 *
 */

public class InMemory implements Storage{

	private int column = 2;
	private int row = 2;
	private Article[][] rack =  new Article[column][row];


	public void configurateSize(int column, int row){
		this.column = column;
		this.row = row;
		//rack =  new Article[column][row];
	}



	public void stockArticle(Article article) {
		for (int x = 0; x < column; x++){
			for(int y = 0; y <row ; y++){
				if(rack[x][y] == null){
					rack[x][y] = article;
					x = column;
					y = row;
					continue;
				}else if(x == column || y == row){
					System.out.println("Es ist kein Platz vorhanden!");
				}else{
					continue;
				}
			}
		}

	}

	public void swapArticle(int article) {
		for (int x = 0; x < column; x++){
			for(int y = 0; y <row ; y++){
				if(rack[x][y].getArticleNumber() == article){
					rack[x][y] = null;
					x = column;
					y = row;
					continue;
				}else if(x == column || y == row){
					System.out.println("Der Artikel wurde nicht gefunden!");
				}else{
					continue;
				}
			}
		}

	}

	public String articlePosition(String article) {
		int positionX = 0;
		int positionY = 0;

		for (int x = 0; x < column; x++){
			for(int y = 0; y < row; y++){
				if(rack[x][y].getArticleName().equals(article)){
					positionX=x;
					positionY=y;
					x = column;
					y = row;
					continue;
				}else if(x == column || y == row){
					System.out.println("Es ist kein Artikel enthalten!");
				}else{
					continue;
				}
			}
		}
		return "Zeile: "+positionY+ " Spalte: "+positionX;
	}

	public void positionContent(int column, int row) {
		try{
			System.out.println(rack[column][row].toString());
		}catch(NullPointerException io){
			System.out.println("Es ist kein Element an dieser Stelle enthalten.");
		}

	}

	public void inventory(){
		//System.out.println(Arrays.deepToString(rack));
		System.out.println("-----------Inventar--------------");
		for (int x = 0; x < column; x++){
			for(int y = 0; y < row; y++){
				if(rack[x][y] != null){
					System.out.println(rack[x][y].toString());
					continue;
				}else if(x == column || y == row){
					System.out.println("Es ist nichts enthalten!");
				}else{
					continue;
				}
			}
		}
		System.out.println("---------------------------------");

	}



}
