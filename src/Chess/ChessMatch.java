package Chess;

import Boardgame.Board;
import Chess.pieces.King;
import Chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);// Classe que reconhece a dimensão do tabuleiro
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); // Downcasting para ser reconhecido como
															// Peça de Xadrez(ChessPiece)
			}
		}
		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('a',8, new Rook(board, Color.BLACK));
		placeNewPiece('e',1, new King(board, Color.WHITE));
		placeNewPiece('e',8, new King(board, Color.BLACK));
	}
}