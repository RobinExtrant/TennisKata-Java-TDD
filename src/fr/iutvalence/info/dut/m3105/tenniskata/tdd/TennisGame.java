package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	public static final String LOVE_FIFTEEN = "fifteen-love";
	public static final String FIFTEEN_ALL = "fifteen-all";
	private String score;
	
	TennisGameScoreAutomate automateScore = new TennisGameScoreAutomate();

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
		automateScore.updateScore("server");
		
		/*if(this.score==LOVE_ALL)
		{
			this.score=FIFTEEN_LOVE;
		}
		else
		{
			this.score=FIFTEEN_ALL;
		}*/
	}

	public void receiverScores()
	{
		automateScore.updateScore("receiver");
		/*if(this.score==LOVE_ALL)
		{
			this.score=LOVE_FIFTEEN;
		}
		else
		{
			this.score=FIFTEEN_ALL;
		}*/
			
	}

}
