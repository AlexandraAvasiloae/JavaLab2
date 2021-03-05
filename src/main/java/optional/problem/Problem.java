package optional.problem;

import optional.destination.Destination;
import optional.sources.Source;

import java.util.Arrays;

public class Problem {
    private Source[] sources;
    private Destination[] destinations;
    private int[][] cost;

    /**
     * Constructor
     * verify if the problem instance does not contain duplicates or if the number of sources and destinations corresponds to the size of the cost matrix, otherwise the object will not be able to be created
     * @param sources
     * @param destinations
     * @param cost
     */
    public Problem(Source[] sources , Destination[] destinations , int[][] cost) {

        if (sources.length != cost.length || destinations.length != cost[0].length) {
            System.out.println("The number of sources and destinations does not correspond to the length of cost matrix");
            System.exit(0);
        }

        if (isTheSameDestinationTwoTimes(destinations) || isTheSameSourcesTwoTimes(sources)) {
            System.out.println("Invalid problem! There is the same source or the same destination in the problem instance");
            System.exit(0);
        }

        this.sources = sources;
        this.destinations = destinations;
        this.cost = cost;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problem problem = (Problem) o;
        return Arrays.equals(sources, problem.sources) && Arrays.equals(destinations, problem.destinations) && Arrays.equals(cost, problem.cost);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(sources);
        result = 31 * result + Arrays.hashCode(destinations);
        result = 31 * result + Arrays.hashCode(cost);
        return result;
    }

    @Override
    public String toString() {
        return "The problem instance is: \n"  +
                "sources=" + Arrays.toString(sources) + "\n" +
                "destinations=" + Arrays.toString(destinations) + "\n"+
                "cost=" + Arrays.deepToString(cost) +
                '}';
    }

    /**
     * setter for cost matrix
     * @param cost
     */
    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    /**
     * setter for destinations
     * @param destinations
     */
    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    /**
     * setter for sources
     * @param sources
     */
    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    /**
     * getter for destinations
     * @return
     */
    public Destination[] getDestinations() {
        return destinations;
    }

    /**
     * getter for cost matrix
     * @return
     */
    public int[][] getCost() {
        return cost;
    }

    /**
     * getter for sources
     * @return
     */
    public Source[] getSources() {
        return sources;
    }

    /**
     * calculates the number of occurrences of a particular source in a given set of sources
     *
     * @param s1       particular surce
     * @param sources1 given set of soruces
     * @return number of occurrences of this set of sources
     */
    public int numberOfOccurrencesOfSources(Source s1, Source[] sources1) {
        int numberOfOccurrences = 0;
        for (Source s : sources1) {
            if (s.equals(s1)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    /**
     * verify if there is the same source in the set of sources given as a parameter
     *
     * @param sources the set of sources
     * @return true, if there is the same source in the given set of sources and false, otherwise
     */
    public boolean isTheSameSourcesTwoTimes(Source[] sources) {
        for (Source s : sources) {
            if (numberOfOccurrencesOfSources(s, sources) > 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * calculates the number of occurrences of a particular destination in a given set of destinations
     *
     * @param d1            particular destination
     * @param destinations1 given set of destinations
     * @return number of occurrences of this set of destinations
     */
    public int numberOfOccurrencesOfDestinations(Destination d1, Destination[] destinations1) {
        int numberOfOccurrences = 0;
        for (Destination d : destinations1) {
            if (d.equals(d1)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    /**
     * verify if there is the same destination in the set of destinations given as a parameter
     *
     * @param destinations the set of destinations
     * @return true, if there is the same destination in the given set of destinations and false, otherwise
     */
    public boolean isTheSameDestinationTwoTimes(Destination[] destinations) {
        for (Destination d : destinations) {
            if (numberOfOccurrencesOfDestinations(d, destinations) > 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * calculates the minimum of a array specified
     *
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
     *
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
     *
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
}
