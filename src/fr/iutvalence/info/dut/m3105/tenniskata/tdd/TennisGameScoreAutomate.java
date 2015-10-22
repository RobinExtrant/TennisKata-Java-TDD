package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGameScoreAutomate {

	private String score;

	public void updateScoreWithServer() 
	{
		if(this.score==TennisGame.LOVE_ALL)
		{
			this.score=TennisGame.FIFTEEN_LOVE;
		}
		else
		{
			this.score=TennisGame.LOVE_FIFTEEN;
		}
	}

	public void updateScoreWithReceiver() 
	{
		
	}

	public String getScore() 
	{
		return this.score;
	}

	public TennisGameScoreAutomate()
	{
		this.score= TennisGame.LOVE_ALL;
	}
}
