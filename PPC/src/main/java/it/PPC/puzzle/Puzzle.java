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