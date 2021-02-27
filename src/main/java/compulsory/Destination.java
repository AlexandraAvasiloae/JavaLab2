package compulsory;

public class Destination {

    private String name;
    private int demand;

    Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "compulsory.Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getDemand() {
        return demand;
    }

    public String getName() {
        return name;
    }
}
