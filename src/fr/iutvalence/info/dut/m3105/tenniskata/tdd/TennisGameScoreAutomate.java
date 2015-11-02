package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import java.util.ArrayList;

public class TennisGameScoreAutomate {

	private String score;

	private ArrayList<Transition> listTransition;

	public void updateScore(String scorer) 
	{
		int indiceTransition = 0;
		Transition transition = this.listTransition.get(indiceTransition);
		while (transition.getStateStart()!=this.score || transition.getScorer()!=scorer)
		{
			indiceTransition++;
			transition = this.listTransition.get(indiceTransition);
		}
		this.score = transition.getStateEnd();
	}

	public String getScore() {
		return this.score;
	}
	
	public TennisGameScoreAutomate()
	{
		this.score= TennisGame.LOVE_ALL;
		this.listTransition = new ArrayList<Transition>();
		this.listTransition.add(new Transition(TennisGame.LOVE_ALL, TennisGame.SERVER, TennisGame.FIFTEEN_LOVE));
		this.listTransition.add(new Transition(TennisGame.LOVE_ALL, TennisGame.RECEIVER, TennisGame.LOVE_FIFTEEN));
		this.listTransition.add(new Transition(TennisGame.FIFTEEN_LOVE, TennisGame.RECEIVER, TennisGame.FIFTEEN_ALL));
		this.listTransition.add(new Transition(TennisGame.LOVE_FIFTEEN, TennisGame.SERVER, TennisGame.FIFTEEN_ALL));
	}
}
