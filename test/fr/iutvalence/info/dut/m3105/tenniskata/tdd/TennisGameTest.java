package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest
{
		
	@Test
	public void testLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(),TennisGame.LOVE_ALL);
	}
	
	@Test
	public void testFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		assertEquals(tennisGame.getScore(),TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void testLoveFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		assertEquals(tennisGame.getScore(),TennisGame.LOVE_FIFTEEN);
	}
	

}
