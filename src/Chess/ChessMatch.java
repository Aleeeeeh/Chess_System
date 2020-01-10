package Chess;

import Boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);// Classe que reconhece a dimensão do tabuleiro
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //Downcasting para ser reconhecido como 
															//Peça de Xadrez(ChessPiece)
			}
		}
		return mat;
	}
}