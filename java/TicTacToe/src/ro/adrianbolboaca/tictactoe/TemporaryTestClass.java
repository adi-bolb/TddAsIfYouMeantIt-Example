package ro.adrianbolboaca.tictactoe;
import static org.junit.Assert.*;
import org.junit.Test;

public class TemporaryTestClass {

	@Test
	public void givenAnEmptyBoardTheGameIsUnderWay() throws Exception {
		String emptyBoard = "empty board";
		String gameIsUnderWay = "nobodyWonYet";
		
		String gameResult = "";
		
		assertEquals(gameIsUnderWay, gameResult);

	}
}
