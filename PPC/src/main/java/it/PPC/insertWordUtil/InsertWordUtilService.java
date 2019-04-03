package it.PPC.insertWordUtil;

import org.springframework.stereotype.Service;

import it.PPC.puzzle.Puzzle;

@Service
public interface InsertWordUtilService {

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione UP.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione RIGHT-UP.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkRightUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione RIGHT.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkRight(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione RIGHT-DOWN.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkRightDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione DOWN.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione LEFT-DOWN.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkLeftDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola può essere inserita in posizione
	 * [row][col] in direzione LEFT.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkLeft(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che controlla se una parola (o la parola invertita) può essere
	 * inserita in posizione [row][col] in direzione LEFT-UP.
	 * 
	 * @param schema
	 * @param row
	 * @param col
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkLeftUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione UP la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione RIGHT-UP la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertRightUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione RIGHT la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertRight(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione RIGHT-DOWN la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertRightDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione DOWN la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione LEFT-DOWN la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertLeftDown(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione LEFT la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertLeft(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce una parola se in direzione LEFT-UP la parola ci sta.
	 * 
	 * @param puzzle
	 * @param row
	 * @param col
	 * @param word
	 * @author Lorenzo
	 */
	void insertLeftUp(Puzzle puzzle, int row, int col, String word);

	/**
	 * Metodo che inserisce la chiave del puzzle se riempie tutti gli spazi vuoti
	 * 
	 * @param puzzle
	 * @param solution
	 * @author Lorenzo
	 */
	void insertSolution(Puzzle puzzle, String solution);

	/**
	 * Metodo che controlla che la soluzione riempia tutti gli spazi liberi.
	 * 
	 * @param puzzle
	 * @param word
	 * @return
	 * @author Lorenzo
	 */
	boolean checkInsertSolution(Puzzle puzzle, String solution);

}
