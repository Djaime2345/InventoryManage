import java.util.ArrayList;
import java.util.Scanner;

/**
 * In this class, we will focus on develop the menu for the user (on terminal)
 *
 * @author Jaime Carrasco
 * @version 1.0
 */

public class Main {
    /**
     * Method that add a new product to the system
     *
     * @param sc Scanner
     * @throws Exception If the user does not type 'y' or 'n' in cold question
     */
    public static Products createProduct(Scanner sc) throws Exception {
        String name;
        int id;
        String description;
        String isCold;
        double price;

        System.out.println("You selected to create a new product");
        System.out.println("Please type the next information for your product: ");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Id: ");
        id = sc.nextInt();
        System.out.println("Description: ");
        description = sc.next();
        System.out.println("Is your product cold? (y/n): ");
        isCold = sc.next();
        System.out.println("Price ($): ");
        price = sc.nextDouble();

        boolean cold;

        if (isCold.equals("y")){
            cold = true;
        } else {
            if (isCold.equals("n")){
                cold = false;
            }
            else {
                throw new Exception ("Unable to understand if the product is cold or not");
            }
        }

        Products product = new Products(name, id, description, cold, price);

        System.out.println("Product added successfully!!");

        return product;
    }

    /**
     * Method that add a new warehouse to the system
     *
     * @param sc Scanner
     * @throws Exception a
     */
    public static Warehouse createWarehouse(Scanner sc) throws Exception {
        String name;
        int id;
        String location;
        String isCold;

        System.out.println("You selected to create a new warehouse");
        System.out.println("Please type the next information for your warehouse: ");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Id: ");
        id = sc.nextInt();
        System.out.println("City where is located: ");
        location = sc.next();
        System.out.println("Will you use it for cold products? (y/n): ");
        isCold = sc.next();

        boolean cold;

        if (isCold.equals("y")){
            cold = true;
        } else {
            if (isCold.equals("n")){
                cold = false;
            }
            else {
                throw new Exception ("Unable to understand if the product is cold or not");
            }
        }

        Warehouse warehouse = new Warehouse(name, id, location, cold);
        int width;
        int length;

        System.out.println("How many shelves will contain your warehouse? (Width of the matrix)");
        width = sc.nextInt();

        System.out.println("How tall they are? (Length of the matrix)");
        length = sc.nextInt();

        warehouse.addShelves(length, width);

        System.out.println("Warehouse created successfully!!");

        return warehouse;
    }

    /**
     * Method that let you insert a product into a warehouse (Not implemented in this version)
     * @param sc
     * @param product
     * @param warehouse
     */
    public static void addProductIntoWarehouse(Scanner sc, ArrayList<Products> product, ArrayList<Warehouse> warehouse){

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean session = true;
        ArrayList<Products> sessionProducts = new ArrayList<>();
        ArrayList<Warehouse> sessionWarehouses = new ArrayList<>();

        do {
            int selection;

            System.out.println("Welcome to the warehouse system, please select what do you want to do (1,2..)");
            System.out.println("1. Create a new product");
            System.out.println("2. Create a warehouse");
            System.out.println("3. Insert a product into a warehouse");
            System.out.println("4. Exit");

            selection = sc.nextInt();

            switch (selection){
                case 1:
                    sessionProducts.add(createProduct(sc));
                    break;
                case 2:
                    sessionWarehouses.add(createWarehouse(sc));
                    break;
                case 3:
                    addProductIntoWarehouse(sc, sessionProducts, sessionWarehouses);
            }
        }
        while(session);
    }





}
