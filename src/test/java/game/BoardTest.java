package game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest{
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("game.BoardTest");
	}
		
	@Test
	public void testToString(){
		String line = "-----";
		Board b = new Board();
		String want =	" | | \n" +
				line + "\n" +
				" | | \n" +
				line + "\n" +
				" | | ";
		System.out.println(b.ToString());
		assertEquals(b.ToString(), want);
	}

	@Test
	public void testCanPlaceMark(){
		Board b = new Board();
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
				assertEquals(b.CanPlaceMark(x, y), true);
			}
		}
	}

	@Test
	public void testPlaceMark(){
		Board b = new Board();
		assertEquals(b.CanPlaceMark(0, 0), true);
		b.PlaceMark("X", 0, 0);
		assertEquals(b.CanPlaceMark(0, 0), false);
	}

}
