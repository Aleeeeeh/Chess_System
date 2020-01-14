package Application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch =  new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces()); //Receber a matriz de peças na partida
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece CapturedPiece = chessMatch.performChessMove(source, target);
		}
		
		

	}

}
