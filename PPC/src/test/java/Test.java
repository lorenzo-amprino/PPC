import java.Puzzle;
import java.io.FileNotFoundException;

import util.leggiFile.FileManagerUtil;

public class Test {
	
	@Test
	void testa(){
		Puzzle puzzle = new Puzzle();
		FileManagerUtil fm = new FileManagerUtil("D:\\PPC", puzzle);
		
		try {
			fm.readWords("altre.txt", puzzle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(puzzle.getListaParole());
	}

}
