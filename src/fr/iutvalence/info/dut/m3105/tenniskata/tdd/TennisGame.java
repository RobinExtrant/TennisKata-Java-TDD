package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	public static final String LOVE_FIFTEEN = "fifteen-love";
	public static final String FIFTEEN_ALL = "fifteen-all";
	
	TennisGameScoreAutomate automateScore;

	public TennisGame()
	{
		  automateScore = new TennisGameScoreAutomate();
	}
		
	public String getScore()
	{
		return this.automateScore.getScore();
	}

	public void serverScores()
	{
		automateScore.updateScoreWithServer();

	}

	public void receiverScores()
	{
		automateScore.updateScoreWithReceiver();
	}

}
