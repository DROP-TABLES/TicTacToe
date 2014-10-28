package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class HumanPlayerTest{
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("game.HumanPlayerTest");
	}

	@Test
	public void testGetMove(){
		HumanPlayer p = new HumanPlayer("X", System.in);
	}
}
