package it.PPC.util.leggiFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import it.PPC.puzzle.Puzzle;

public class FileManagerUtil {
	
	String path;
	File file;
	Puzzle puzzle;
	
	public FileManagerUtil(String path, Puzzle puzzle) {
		this.path=path;
	}

	public void createSchemaFile(Puzzle puzzle) throws IOException {
		File file = new File(path + "\\" + puzzle.getNome() + ".txt");
		file.createNewFile();
		this.file = file;
	}
	
	public void writeSchema(Puzzle puzzle) throws IOException {
		createSchemaFile(puzzle);
		Writer wr = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(int i=0; i<puzzle.getSchema().length; i++) {
			for(int j =0 ; j<puzzle.getSchema()[i].length; j++) {
				bw.write(puzzle.getSchema()[i][j]);
			}
			bw.newLine();
		}
		bw.close();
	}
	
	public void readWords(String fileName, Puzzle puzzle) throws FileNotFoundException {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				String lineTrimmed = line.trim();
				puzzle.getListaParole().add(lineTrimmed);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}

