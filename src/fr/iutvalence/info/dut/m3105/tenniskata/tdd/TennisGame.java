package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	private String score;
	
	public TennisGame()
	{
		this.score=LOVE_ALL;
	}
		
	public String getScore()
	{
		return this.score;
	}

	public void serverScores()
	{
		this.score=FIFTEEN_LOVE;
	}

}
