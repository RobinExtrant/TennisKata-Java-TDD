package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class Transition {
	
	private final String stateStart;
	private final String scorer;
	private final String stateEnd;
	
	public Transition(String stateStart, String scorer, String stateEnd)
	{
		this.stateStart = stateStart;
		this.scorer = scorer;
		this.stateEnd = stateEnd;
	}

	public String getScorer() {
		return scorer;
	}

	public String getStateStart() {
		return stateStart;
	}

	public String getStateEnd() {
		return stateEnd;
	}
}
