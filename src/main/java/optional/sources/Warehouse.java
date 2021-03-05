package optional.sources;

import optional.sources.Source;

public class Warehouse extends Source {
    /**
     * Constructor
     * @param name
     * @param supply
     */
    public Warehouse(String name, int supply) {
        super(name, "Warehouse", supply);
    }

    @Override
    public void setType() {
        this.type = "Warehouse";
    }
}
