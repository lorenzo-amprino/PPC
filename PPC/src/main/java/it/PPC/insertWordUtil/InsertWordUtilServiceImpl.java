package it.PPC.insertWordUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.ChangedCharSetException;

import it.PPC.puzzle.Puzzle;

public class InsertWordUtilServiceImpl implements InsertWordUtilService {

	@Override
	public boolean checkUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= row + 1) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row - i][col]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkRightUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= row + 1 && wordLength <= schema[0].length - col) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row - i][col + i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkRight(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= schema[0].length - col) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row][col + i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkRightDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= schema.length - row + 1 && wordLength <= schema[0].length - col) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row + i][col + i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= schema[0].length - row + 1) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row + i][col]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkLeftUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= row + 1 && wordLength <= col + 1) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row + i][col - i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkLeft(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= col + 1) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row][col - i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public boolean checkLeftDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		int wordLength = word.length();

		if (wordLength <= schema.length - row && wordLength <= col + 1) {
			StringBuilder regex = new StringBuilder();

			for (int i = 0; i < wordLength; i++) {
				regex.append(schema[row + i][col - i]);
			}
			Pattern pattern = Pattern.compile(regex.toString());
			Matcher matcher = pattern.matcher(word);

			return matcher.find();
		} else {
			return false;
		}
	}

	@Override
	public void insertUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkUp(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row - i][col] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertRightUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkRightUp(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row - i][col + i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertRight(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkRight(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row][col + i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertRightDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkRightDown(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row + i][col + i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertLeftDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkLeftDown(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row + i][col - i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertLeftUp(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkLeftUp(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row - i][col - i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertLeft(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkLeft(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row][col - i] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertDown(Puzzle puzzle, int row, int col, String word) {
		char[][] schema = puzzle.getSchema();
		if (checkDown(puzzle, row, col, word)) {
			for (int i = 0; i < word.length(); i++) {
				schema[row + i][col] = word.charAt(i);
			}
		}

	}

	@Override
	public void insertSolution(Puzzle puzzle, String solution) {
		char[][] schema = puzzle.getSchema();
		if (checkInsertSolution(puzzle, solution)) {
			int counter = 0;
			for (int i = 0; i < schema.length; i++) {
				for (int j = 0; j < schema[i].length; j++) {
					if (schema[i][j] == '.') {
						schema[i][j] = solution.charAt(counter);
						counter++;
					}
				}
			}
		}

	}

	@Override
	public boolean checkInsertSolution(Puzzle puzzle, String solution) {
		if (puzzle.retriveEmptySpaces() == solution.length()) {
			return true;
		} else {
			return false;
		}
	}

}
