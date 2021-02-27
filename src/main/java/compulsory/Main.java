package compulsory;

import compulsory.Destination;

public class Main {
    public static void main(String[] args) {

        Source s1 = new Source("S1", SourceType.FACTORY, 10);

        Source s2 = new Source("S2", SourceType.WAREHOUSE, 35);

        Source s3 = new Source("S3", SourceType.WAREHOUSE, 25);

        Destination d1 = new Destination("D1", 20);

        Destination d2 = new Destination("D2", 25);

        Destination d3 = new Destination("D3", 25);

        Problem p = new Problem(new Source[]{s1,s2,s3},new Destination[]{d1,d2,d3},new int [][]{{2,3,1},{5,4,8},{5,6,8}});

        System.out.println(p.minimCostOfTransport(p.getCost()));
    }
}