package optional.sources;

abstract public class Source {

    private String name;
    protected String type;
    private int supply;

    /**
     * Constructor default if if no name, type or supply is specified
     */
    public Source(){
    this.name="NoSourceName";
    this.supply=0;
    this.type="NoType";
    }

    /**
     * Constructor
     * @param name
     * @param type
     * @param supply
     */
    public Source(String name, String type, int supply){
        this.name=name;
        this.type=type;
        this.supply=supply;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(getClass()!=obj.getClass() || obj==null){
            return false;
        }
        Source s = (Source) obj;
        return supply==s.supply && type.equals(s.type) && name.equals(s.name);
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", supply=" + supply +
                '}';
    }

    /**
     * setter for supply
     * @param supply
     */
    public void setSupply(int supply) {
        this.supply = supply;
    }

    /**
     * setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * abstract setter for type
     */
    abstract public void setType();

    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * getter for supply
     * @return
     */
    public int getSupply() {
        return supply;
    }

    /**
     * getter for type
     * @return
     */
    public String getType() {
        return type;
    }
}
