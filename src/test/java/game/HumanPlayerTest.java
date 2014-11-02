package game;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanPlayerTest{
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("game.HumanPlayerTest");
	}

	@Test
	public void testGetMove(){
		//here we make a custom input stream
		String str = "1 1 0 2";
		InputStream is = new ByteArrayInputStream(str.getBytes());
		// give the human player our custom input stream
		HumanPlayer p = new HumanPlayer("X", is); // reads string like console input
		int[] a = p.GetMove();
		assertEquals(a[0], 1);
		assertEquals(a[1], 1);
		a = p.GetMove();
		assertEquals(a[0], 0);
		assertEquals(a[1], 2);
	}
}
