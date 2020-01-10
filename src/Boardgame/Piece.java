package Boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // N�o h� necessidade pois o java ja entenderia que seria nulo
	}

	protected Board getBoard() {
		return board;
	}

}
