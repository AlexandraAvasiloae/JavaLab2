package optional.solution;

import optional.problem.Problem;

public class Solution {

    private int minimCost;

    /**
     * Constructor
     * @param p the problem for which the solution is found
     */
    public Solution(Problem p){
        this.minimCost=p.minimCostOfTransport(p.getCost());
    }

    /**
     * setter for problem solution which means the minim cost of transport
     * @param minimCost the minim cost of transport for problem
     */
    public void setMinimCost(int minimCost) {
        this.minimCost = minimCost;
    }

    /**
     * getter for problem solution which means the minim cost of transport
     * @return the minim cost of transport for problem
     */
    public int getMinimCost() {
        return minimCost;
    }
}
