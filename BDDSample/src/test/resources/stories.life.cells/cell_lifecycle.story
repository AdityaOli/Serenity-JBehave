Meta:

Narrative:
As a Conway's Game Of Life universe
I want to make some cells evolve
So that we can see some beautiful patterns

Scenario: Cell reproduction
Given a dead cell
And the cell has 3 live neighbours
When the cell evolves to the next generation
Then the cell is now alive

Scenario: Cell death by overpopulation
Given a live cell
And the cell has 4 live neighbours
When the cell evolves to the next generation
Then the cell is now dead