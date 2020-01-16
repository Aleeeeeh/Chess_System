package Chess;

import Boardgame.Board;
import Boardgame.Piece;
//Se tornou abstrata para que fosse possivel herdar da classe Piece
public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
