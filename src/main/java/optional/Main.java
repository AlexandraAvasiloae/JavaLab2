package optional;

import optional.destination.Destination;
import optional.problem.Problem;
import optional.solution.Solution;
import optional.sources.Factory;
import optional.sources.Source;
import optional.sources.Warehouse;

public class Main {
    public static void main(String[] args) {

        Factory s1 = new Factory("S1", 10);

        Warehouse s2 = new Warehouse("S2", 35);

        Warehouse s3 = new Warehouse("S3", 25);

        Destination d1 = new Destination("D1", 20);

        Destination d2 = new Destination("D2", 25);

        Destination d3 = new Destination("D3", 25);

        Problem problem = new Problem(new Source[]{s1, s2, s3}, new Destination[]{d1, d2, d3}, new int[][]{{2, 3, 1}, {5, 4, 8}, {5, 6, 8}});

        Solution solution = new Solution(problem);

        System.out.println(problem.toString());

        System.out.println("The problem solution is the minim cost = " + solution.getMinimCost());
    }

}
