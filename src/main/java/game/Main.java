package game;

public class Main {
	public static void main(String[] args) {
		Board b = new Board();
		System.out.print("Welcome to TicTacToe");
		System.out.print("Press '1' if you want to play Human VS Human \n");
		System.out.print("Press '2' if you want to play Human VS Computer \n");
		System.out.print("Press '3' if you want to play Computer VS Computer \n");
		
		int typeOfGame = System.In.read();
		Player P1;
		Player P2;
		switch(typeOfGame) {
		case 1:
			System.out.print("Player 1 type in your mark : ");
			String P1_M = "X";
			System.out.print("\n");
			System.out.print("Player 2 type in your mark : ");
			String P2_M = "O";
			System.out.print("\n");
			P1 = new HumanPlayer(P1_M,System.in);
			P2 = new HumanPlayer(P2_M,System.in);
			break;
		case 2:
			System.out.print("Player 1 type in your mark : ");
			String HP1 = "X";
			System.out.print("\n");
			System.out.print("Player 2 is computerplayer with mark \"O\"\n");
			P1 = new HumanPlayer(HP1,System.in);
			P2 = new ComputerPlayer("O");
		case 3:
			System.out.print("Player 1 : X , Player 2 : O \n");
			P1 = new ComputerPlayer("X");
			P2 = new ComputerPlayer("O");
		}
		System.out.print("Let The Games BEGIN ! \n");
		while(true)
		{
			//Player 2 function////////////////////////////////////////////////////////////////////////////
			int[] a = P1.GetMove();
			while(!b.PlaceMark(P1.GetMark(), a[0],a[1]))
			{	a = P1.GetMove();	}
			if(b.win())
			{
				System.out.print("Player 1 WINS \n");
				break;
			}
			if(b.IsFull())
			{
				System.out.print("You Both lose");
				break;
			}
			//PLayer 2 function///////////////////////////////////////////////////////////////////////////
			a = P2.GetMove();
			while(!b.PlaceMark(P2.GetMark(), a[0],a[1]))
			{	a = P2.GetMove();	}
			if(b.win())
			{
				System.out.print("Player 2 WINS \n");
				break;
			}
			if(b.IsFull())
			{
				System.out.print("You Both lose");
				break;
			}
			
		}
		System.out.print("Game Has Ended \n");
	}
}

