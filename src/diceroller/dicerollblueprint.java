package diceroller;

public class dicerollblueprint {

	private int numRolls;
	
	public dicerollblueprint()
	{
		numRolls=0;
	}
	
	public int roll()
	{
		numRolls = numRolls +1;
		int rollValue = (int)(Math.random()*6)+1;
		return rollValue;
	}
	
	public int numRolls()
	{
		return numRolls;
	}
	
	public void reset()
	{
		numRolls = 0;
	}
}
