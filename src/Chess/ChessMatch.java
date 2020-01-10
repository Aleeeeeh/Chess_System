package Chess;

import Boardgame.Board;
import Boardgame.Position;
import Chess.pieces.King;
import Chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);// Classe que reconhece a dimens�o do tabuleiro
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //Downcasting para ser reconhecido como 
															//Pe�a de Xadrez(ChessPiece)
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
}