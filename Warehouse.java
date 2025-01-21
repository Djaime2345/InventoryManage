/**
 * This class is focused on contains the different warehouses that will keep our products
 *
 * @author Jaime Carrasco
 * @version 1.0
 */

public class Warehouse {
    private String name;
    private int id;
    private String cityOfLocation;
    private static int countOfWarehouses;
    private Boolean isCold;
    private Products[][] content;

    /**
     * Constructor method
     *
     * @param name Name of the warehouse
     * @param id Id of the warehouse
     * @param cityOfLocation City where the warehouse is located
     * @param isCold Tells if the warehouse can contain cold products or not
     *
     */
    public Warehouse(String name, int id, String cityOfLocation, Boolean isCold) {
        this.name = name;
        this.id = id;
        this.cityOfLocation = cityOfLocation;
        this.isCold = isCold;
        countOfWarehouses++;
    }

    /**
     * Getter of the warehouse's name
     *
     * @return Name of the warehouse
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of the warehouse's id
     *
     * @return Id of the warehouse
     */
    public int getId() {
        return id;
    }

    /**
     * Getter of the warehouse's location
     *
     * @return City of the warehouse
     */
    public String getCityOfLocation() {
        return cityOfLocation;
    }

    /**
     * Getter of the 'isCold' attribute
     *
     * @return The warehouse is cold or not
     */
    public Boolean getCold() {
        return isCold;
    }

    /**
     * Setter of the warehouse's name
     *
     * @param name  New name of the warehouse
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter of the warehouse's id
     *
     * @param id  New id of the warehouse
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter of the warehouse's city
     *
     * @param cityOfLocation  New city of the warehouse
     */
    public void setCityOfLocation(String cityOfLocation) {
        this.cityOfLocation = cityOfLocation;
    }

    /**
     * Setter if the warehouse is cold or not
     *
     * @param cold It is cold or not
     */
    public void setCold(Boolean cold) {
        isCold = cold;
    }
}
