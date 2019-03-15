package it.PPC.insertWordUtil;

import org.springframework.stereotype.Service;

@Service
public interface InsertWordUtilService {

	boolean checkUp(char[][] schema, int row, int col, String word);

	boolean checkRightUp(char[][] schema, int row, int col, String word);

	boolean checkRight(char[][] schema, int row, int col, String word);

	boolean checkRightDown(char[][] schema, int row, int col, String word);

	void insertUp(char[][] schema, int row, int col, String word);

	void insertRightUp(char[][] schema, int row, int col, String word);

	void insertRight(char[][] schema, int row, int col, String word);

	void insertRightDown(char[][] schema, int row, int col, String word);
}
