package Boardgame;

public class Board {
	  private int rows;
	  private int collumns;
	  private Piece [][] pieces;
	
	  
	  public Board(int rows, int collumns) {
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns]; 	
		
	  }


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getCollumns() {
		return collumns;
	}


	public void setCollumns(int collumns) {
		this.collumns = collumns;
	}
	  
	  1
	  
	 
}
