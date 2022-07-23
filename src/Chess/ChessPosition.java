package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (row < 0 || row > 8 || column < 'a' || column > 'h') {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	public Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	public ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}

}
