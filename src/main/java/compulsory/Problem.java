package compulsory;

import compulsory.Destination;

import java.util.Arrays;

public class Problem {

    private Source[] sources;
    private Destination[] destinations;
    private int[][] cost;

    Problem(Source[] sources, Destination[] destinations, int[][] cost) {

        this.sources = sources;
        this.destinations = destinations;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "compulsory.Problem{" +
                "sources=" + Arrays.toString(sources) +
                ", destinations=" + Arrays.toString(destinations) +
                ", cost=" + Arrays.toString(cost) +
                '}';
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public int[][] getCost() {
        return cost;
    }

    public Source[] getSources() {
        return sources;
    }

    /**
     * calculates the minimum of a array specified
     * @param array the array for which I calculate the minimum value
     * @return minimum value of the array
     */
    public int minimInArray(int[] array) {
        int minim = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }

        }
        return minim;
    }

    /**
     * calculates the maximum of a array specified
     * @param array the array for which I calculate the maximum value
     * @return maximum value of the array
     */
    public int maximInArray(int[] array) {
        int maxim = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
        }
        return maxim;
    }

    /**
     * solve the transport problem calculating the minim cost
     * @param cost cost matrix
     * @return minim Cost after the calculation
     */
    public int minimCostOfTransport(int[][] cost) {
        int minimCost = 0;
        for (int i = 0; i < cost.length; i++) {
            if (sources[i].getSupply() < destinations[i].getDemand()) {
                minimCost += sources[i].getSupply() * minimInArray(cost[i]);
            } else {
                minimCost += destinations[i].getDemand() * minimInArray(cost[i]);
                minimCost += (sources[i].getSupply() - destinations[i].getDemand()) * maximInArray(cost[i]);
            }
        }
        return minimCost;
    }
    public void printCostMatrix(){
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.print(sources[i].getSupply());
            System.out.println();
        }
        for (int i = 0; i < destinations.length; i++) {
            System.out.print(destinations[i].getDemand() + " ");
        }
    }
}
