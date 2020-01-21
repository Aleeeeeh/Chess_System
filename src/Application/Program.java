package Application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		// Enquanto a partida não estiver em checkMate Rode o programa
		while (!chessMatch.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece CapturedPiece = chessMatch.performChessMove(source, target);
				if (CapturedPiece != null) {
					captured.add(CapturedPiece);
				}

			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); // Para o programa aguardar dar um enter
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); // Para o programa aguardar dar um enter
			}
		}
		//Quando ocorrer o checkMate limpe a tela e exiba a partida finalizada
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);

	}

}
