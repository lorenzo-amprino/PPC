package it.PPC.model;

import it.PPC.puzzle.Puzzle;

public class CreatePuzzleResponse {
	
	Puzzle puzzle;

	public Puzzle getPuzzle() {
		return puzzle;
	}

	public void setPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
	}

	@Override
	public String toString() {
		return "CreatePuzzleResponse [puzzle=" + puzzle + "]";
	}
	
	

}
