package life.at;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CellSteps 
{
	private boolean cellIsDead;
	private int numberOfLiveNeighbours;

	@Given("a dead cell")
	public void givenADeadCell() {
	  this.cellIsDead = true;
	}
	
	@Given("a live cell")
	public void givenALiveCell() {
	  this.cellIsDead = false;
	}
	
	@Given("the cell has $livecells live neighbours")
	public void givenTheCellHas3LiveNeighbours(int livecells) {
	  this.numberOfLiveNeighbours = livecells;
	}

	@When("the cell evolves to the next generation")
	public void whenTheCellEvolvesToTheNextGeneration() {
	  this.cellIsDead = this.numberOfLiveNeighbours > 3;
	}

	@Then("the cell is now alive")
	public void thenTheCellIsNowAlive() {
	  assertFalse(this.cellIsDead);
	}
	
	@Then("the cell is now dead")
	public void thenTheCellIsNowDead() {
	  assertTrue(this.cellIsDead);
	}
}
