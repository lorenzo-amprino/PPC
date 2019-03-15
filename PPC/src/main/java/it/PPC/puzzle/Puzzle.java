package it.PPC.puzzle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Puzzle {

	private char[][] schema;
	private List<String> listaParole;
	private List<String> paroleUsate;
	private String chiave;
	private String nome;

	public Puzzle() {
		this.listaParole = new ArrayList<String>();
	}

	public Puzzle(int row, int col) {
		this.listaParole = new ArrayList<String>();
		this.schema = new char[row][col];
		setupSchema(schema);

	}

	// methods

	/**
	 * Metodo che riempie lo schema di caratteri di default '.'. 
	 * Viene chiamato all'interno del costruttore per inizializzare lo schema.
	 * 
	 * @param schema
	 * @author Lorenzo
	 */
	private void setupSchema(char[][] schema) {
		for (int i = 0; i < schema.length; i++) {
			for (int j = 0; j < schema[i].length; j++) {
				schema[i][j] = '.';
			}
		}
	}

	/**
	 * Metodo che stampa in console lo schema lettera per lettera.
	 * 
	 * @author Lorenzo
	 */
	public void printSchema() {
		for (int i = 0; i < schema.length; i++) {
			for (int j = 0; j < schema[i].length; j++) {
				if (j == schema[i].length - 1) {
					System.out.println(schema[i][j]);
				} else {
					System.out.print(schema[i][j]);
				}
			}
		}
	}

	// getter and setter

	public char[][] getSchema() {
		return schema;
	}

	public void setSchema(char[][] schema) {
		this.schema = schema;
	}

	public List<String> getListaParole() {
		return listaParole;
	}

	public void setListaParole(List<String> listaParole) {
		this.listaParole = listaParole;
	}

	public List<String> getParoleUsate() {
		return paroleUsate;
	}

	public void setParoleUsate(List<String> paroleUsate) {
		this.paroleUsate = paroleUsate;
	}

	public String getChiave() {
		return chiave;
	}

	public void setChiave(String chiave) {
		this.chiave = chiave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
