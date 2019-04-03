import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import it.PPC.insertWordUtil.InsertWordUtilService;
import it.PPC.insertWordUtil.InsertWordUtilServiceImpl;
import it.PPC.puzzle.Puzzle;
import it.PPC.util.leggiFile.FileManagerUtil;

public class ClasseDiTest {

	@Ignore
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

	@Test
	public void regexTest() {
		Puzzle puzzle = new Puzzle();
		puzzle.setSchema(new char[][] { { '.', '.', '.', '.', '.' },
										{ '.', '.', '.', '.', '.' },
										{ '.', '.', 'c', '.', '.' },
										{ '.', '.', '.', '.', '.' },
										{ '.', '.', '.', '.', '.' } });
		puzzle.printSchema();
		System.out.println(puzzle.getSchema().length);
		InsertWordUtilService service = new InsertWordUtilServiceImpl();
		System.out.println("up: " + service.checkUp(puzzle, 2, 2, "cia"));
		System.out.println("right up: " + service.checkRightUp(puzzle, 2, 2, "cia"));
		System.out.println("right: " + service.checkRight(puzzle, 2, 2, "cia"));
		System.out.println("right down: " + service.checkRightDown(puzzle, 2, 2, "cia"));
		System.out.println("Down: " + service.checkDown(puzzle, 2, 2, "cia"));
		System.out.println("Left down: " + service.checkLeftDown(puzzle, 2, 2, "cia"));
		System.out.println("left: " + service.checkLeft(puzzle, 2, 2, "cia"));
		System.out.println("left up: " + service.checkLeftUp(puzzle, 2, 2, "cia"));

		service.insertUp(puzzle, 2, 2, "cia");
		service.insertDown(puzzle, 2, 2, "cia");
		service.insertRightUp(puzzle, 2, 2, "cia");
		service.insertLeftUp(puzzle, 2, 2, "cia");
		service.insertRightDown(puzzle, 2, 2, "cia");
		service.insertLeftDown(puzzle, 2, 2, "cia");
		service.insertRight(puzzle, 2, 2, "cia");
		service.insertLeft(puzzle, 2, 2, "cia");

		puzzle.printSchema();
	}

}
