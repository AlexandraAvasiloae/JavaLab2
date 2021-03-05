package optional.sources;

public class Factory extends Source {
    /**
     * Constructor
     * @param name
     * @param supply
     */
    public Factory (String name, int supply){
        super(name, "Factory",supply);
    }

    @Override
    public void setType() {
        this.type="Factory";
    }
}
