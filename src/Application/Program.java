package Application;

import Chess.ChessMatch;

public class Program {
	public static void main(String args[]) {
		//UI - User Interface
		ChessMatch chessMatch =  new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); //Receber a matriz de peças na partida
		

	}

}
