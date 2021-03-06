package Chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;
//Se tornou abstrata para que fosse possivel herdar da classe Piece
public abstract class ChessPiece extends Piece {
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	//Aumentar a contagem de movimentos
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	//Pegar a posi��o da pe�a no tabuleiro
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	//Mostra quando for uma pe�a do oponente
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
