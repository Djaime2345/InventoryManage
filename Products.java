import java.util.ArrayList;

/**
 * This class is focused on contains the description of the different products that will contain our
 * warehouses
 *
 * @author Jaime Carrasco
 * @version 1.0
 */

public class Products {
    private String name;
    private int id;
    private String description;
    private final Boolean isCold;
    private double currentPrice;
    private ArrayList<Double> historicalOfPrices;

    /**
     * Constructor of products
     *
     * @param name Name of the product
     * @param id Id of the product
     * @param description Short description of the product
     * @param isCold Attribute that says if the product needs to be contained in a cold place
     * @param price Array of prices since the creation of the product (Initial price)
     */
    public Products(String name, int id, String description, Boolean isCold, double price) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.isCold = isCold;
        this.currentPrice = price;
        this.historicalOfPrices.add(price);
    }

    /**
     * Getter of the product's name
     *
     * @return Name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of the product's id
     *
     * @return Id of the product
     */
    public int getId() {
        return id;
    }

    /**
     * Getter of the product's description
     *
     * @return Description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter of the product's cold state
     *
     * @return True if the product is cold
     */
    public Boolean getCold() {
        return isCold;
    }

    /**
     * Getter of the current price of the product
     *
     * @return Current price
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Getter of the product's historical prices
     *
     * @return ArrayList of prices of the product
     */
    public ArrayList<Double> getHistoricalOfPrices() {
        return historicalOfPrices;
    }

    /**
     * Setter of the product's name
     *
     * @param name New name for the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter of the product's id
     *
     * @param id New id for the product
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter of the product's description
     *
     * @param description New description for the product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method that let you change the current price of a product
     * It also adds the price to the arraylist of historical prices
     *
     * @param price New price for the product
     */
    public void changePrice(double price){
        this.currentPrice = price;
        this.historicalOfPrices.add(price);
    }

}

