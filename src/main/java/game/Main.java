package game;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Main {
	public static void main(String[] args) {
		Board b = new Board();
		StdOut.println("Welcome to TicTacToe");
		StdOut.print("Press '1' if you want to play Human VS Human \n");
		StdOut.print("Press '2' if you want to play Human VS Computer \n");
		StdOut.print("Press '3' if you want to play Computer VS Computer \n");
		
		int typeOfGame = StdIn.readInt();
		Player P1;
		Player P2;
		switch(typeOfGame) {
		case 1:
			StdOut.print("Player 1 type in your mark : ");
			String P1_M = StdIn.readLine();
			StdOut.print("\n");
			StdOut.print("Player 2 type in your mark : ");
			String P2_M = StdIn.readLine();
			StdOut.print("\n");
			P1 = new HumanPlayer(P1_M,System.in);
			P2 = new HumanPlayer(P2_M,System.in);
			break;
		case 2:
			StdOut.print("Player 1 type in your mark : ");
			String HP1 = StdIn.readLine();
			StdOut.print("\n");
			StdOut.print("Player 2 is computerplayer with mark \"O\"\n");
			P1 = new HumanPlayer(HP1,System.in);
			P2 = new ComputerPlayer("O");
		case 3:
			StdOut.print("Player 1 : X , Player 2 : O \n");
			P1 = new ComputerPlayer("X");
			P2 = new ComputerPlayer("O");
		}
		StdOut.print("Let The Games BEGIN ! \n");
		while(true)
		{
			//Player 2 function////////////////////////////////////////////////////////////////////////////
			int[] a = P1.GetMove();
			while(!b.PlaceMark(P1.GetMark(), a[0],a[1]))
			{	a = P1.GetMove();	}
			if(b.win())
			{
				StdOut.print("Player 1 WINS \n");
				break;
			}
			if(b.IsFull())
			{
				StdOut.println("You Both lose");
				break;
			}
			//PLayer 2 function///////////////////////////////////////////////////////////////////////////
			a = P2.GetMove();
			while(!b.PlaceMark(P2.GetMark(), a[0],a[1]))
			{	a = P2.GetMove();	}
			if(b.win())
			{
				StdOut.print("Player 2 WINS \n");
				break;
			}
			if(b.IsFull())
			{
				StdOut.println("You Both lose");
				break;
			}
			
		}
		StdOut.print("Game Has Ended \n");
	}
}

