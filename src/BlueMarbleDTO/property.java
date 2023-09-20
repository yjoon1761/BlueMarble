package BlueMarbleDTO;

public class property {
    private int PROPERTY;
    private int OWNER;
    private int LOCATION;
    private int BUILDING;
    private int PURCHASE;

    public int getPROPERTY() {
        return PROPERTY;
    }

    public void setPROPERTY(int PROPERTY) {
        this.PROPERTY = PROPERTY;
    }

    public int getOWNER() {
        return OWNER;
    }

    public void setOWNER(int OWNER) {
        this.OWNER = OWNER;
    }

    public int getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(int LOCATION) {
        this.LOCATION = LOCATION;
    }

    public int getBUILDING() {
        return BUILDING;
    }

    public void setBUILDING(int BUILDING) {
        this.BUILDING = BUILDING;
    }

    public int getPURCHASE() {
        return PURCHASE;
    }

    public void setPURCHASE(int PURCHASE) {
        this.PURCHASE = PURCHASE;
    }

    @Override
    public String toString() {
        return "property{" +
                "PROPERTY=" + PROPERTY +
                ", OWNER=" + OWNER +
                ", LOCATION=" + LOCATION +
                ", BUILDING=" + BUILDING +
                ", PURCHASE=" + PURCHASE +
                '}';
    }
}