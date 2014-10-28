package game;

import java.io.*;

public class HumanPlayer extends Player{

	private String mark;
	private InputStream cin;
	
	public HumanPlayer(String m, InputStream in){
		super(m);
		this.cin = in;
	}
	
	@Override
	public int[] GetMove(){
		println("please enter a x value");
		int x = readInt();
		println("please enter a y value");
		int y = readInt();
		int[] r = new int[2];
		r[0] = x;
		r[1] = y;
		return r;
	}
	
	private void println(String s){
		System.out.println(s);
	}

	private int readInt(){
		try{
			int r = this.cin.read();
			if(r == 32){//we have a space char
				return readInt();
			}
			return r - 48; 
		}catch(IOException i){
			println("read failed");
			return 0;
		}
	}
}
