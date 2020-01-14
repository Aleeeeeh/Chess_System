package Application;

import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch =  new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces()); //Receber a matriz de pe�as na partida
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece CapturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); //Para o programa aguardar dar um enter
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); //Para o programa aguardar dar um enter
			}
		}
		
		

	}

}
