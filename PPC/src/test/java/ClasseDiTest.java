import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import it.PPC.puzzle.Puzzle;
import it.PPC.util.leggiFile.FileManagerUtil;

public class ClasseDiTest {

	@Test
	public void testa() {
		Puzzle puzzle = new Puzzle(5, 5);
		FileManagerUtil fm = new FileManagerUtil("D:\\PPC", puzzle);

		try {
			fm.createSchemaFile(puzzle);
			fm.readWords("D:\\PPC\\altre.txt", puzzle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(puzzle.getListaParole());
		puzzle.printSchema();

	}

}
