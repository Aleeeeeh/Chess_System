package Chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;
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
	//Pegar a posição da peça no tabuleiro
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	//Mostra quando for uma peça do oponente
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
