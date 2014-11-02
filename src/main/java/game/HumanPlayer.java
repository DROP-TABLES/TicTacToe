package game;

import java.io.*;

public class HumanPlayer extends Player{

	private String mark;
	private InputStream cin; // so we can use alternate input streams in testing
	
	public HumanPlayer(String m, InputStream in){
		super(m);
		this.cin = in;
	}
	
	@Override
	public int[] GetMove(){
		println("Please enter a x value");
		int x = readInt();
		while(x < 0 || x > 2) {
			println("Not a valid x value (0-2)"); //should add outputstreams as variable too
			x = readInt();
		}
		println("Please enter a y value");
		int y = readInt();
		while(y < 0 || y > 2) {
			println("Not a valid y value (0-2)");
			y = readInt();
		}

		//let's package our information and return it
		int[] r = new int[2];
		r[0] = x;
		r[1] = y;
		return r;
	}

	// a quick helper to print strings	
	private void println(String s){
		System.out.println(s);
	}

	private int readInt(){
		try{
			int r = this.cin.read();
			if(r == 32 || r == 10){//we have a space char or newline
				return readInt();
			}
			return r - 48; 
		}catch(IOException i){
			println("Read failed!");
			return 0;
		}
	}
}
