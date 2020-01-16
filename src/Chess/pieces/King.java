package Chess.pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	public String toString() {
		return "K";
	}
	
	//Instanciamos a matriz com tudo falso e retornando a matriz apenas
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
