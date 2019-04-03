package it.PPC.model;

import org.springframework.stereotype.Component;

@Component
public class CreatePuzzleRequest {
	
	int col;
	int row;
	
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	

}
