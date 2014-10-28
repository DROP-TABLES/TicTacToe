package game;

public class ComputerPlayer extends Player{
	public ComputerPlayer(String m){
		super(m);
	}
	
	public int[] GetMove(){
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 1;
		return a;
	}

}
