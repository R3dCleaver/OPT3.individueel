import java.util.Scanner;

public class Main {
    private static LoginHandler loginHandler;
    private static KeuzeMenu keuzeMenu;
    private static OverviewWindow overviewWindow;
    private static BeheerWindow beheerWindow;
    private static Detailwindow detailwindow;

    public static void usersvoegen() {
        UsersMap.addUser("Julian", "Julian");
        UsersMap.addUser("Jordan", "Jordan");
        UsersMap.addUser("Shanty", "Shanty");
    }

    public static void allWindows() {
        loginHandler = new LoginHandler();
        keuzeMenu = new KeuzeMenu();
        overviewWindow = new OverviewWindow();
        beheerWindow = new BeheerWindow();
        detailwindow = new Detailwindow();
    }

    public static void main(String[] args) {


        //Log in procedure
        usersvoegen();
        allWindows();
        Scanner scanner = new Scanner(System.in);

//        boolean loggedIn = false;
//        while (!loggedIn) {
//            loginHandler.loginLoop(); // User keeps logging in until the password matches the username in the hashmap
//            loggedIn = true; // Set loggedIn to true once the login is successful
//        }
//
//        boolean keepRunning = true;
//        while (keepRunning) {
//            keuzeMenu.DisplayWindow(); // User has 3 options: Overzicht, Beheer, Uitloggen
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    // Overzicht
//                    overviewWindow.OverzichtWindow();
//                    System.out.println();
//                    System.out.println("Maak keuze uit: ");
//                    System.out.println("1. Product gegevens");
//                    System.out.println("2. Huur berekenen");
//                    System.out.print("Uw keuze: ");
//                    int methodChoice = scanner.nextInt();
//                    switch (methodChoice) {
//                        case 1:
//                            detailwindow.kiesProductEnShowDetails();
//                            break;
//                        case 2:
//                            detailwindow.displayProductDetails();
//                            break;
//                        default:
//                            System.out.println("Invalid method choice!");
//                            break;
//                    }
//                    break;
//                case 2:
//                    // Beheer
//                    beheerWindow.showProductClasses();
//                    break;
//                case 3:
//                    // Uitloggen
//                    loggedIn = false;
//                    keepRunning = false;
//                    break;
//                default:
//                    System.out.println("Niet gelukt, probeer opnieuw.");
//                    break;
//            }
//        }
//
//        if (!loggedIn) {
//            main(args); // Restart the application if the user logged out
//        }
        Voorraadstatus voorraadstatus = new Voorraadstatus();
        voorraadstatus.registerObserver(overviewWindow);

        overviewWindow.OverzichtWindow();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Rent a product");
            System.out.println("2. Return a product");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available products for rent:");
                    voorraadstatus.showAlleProductenOpVoorraadMetBeschrijving();
                    System.out.println("Enter the index of the product you want to rent:");
                    int rentIndex = scanner.nextInt();
                    voorraadstatus.rentProduct(rentIndex);
                    break;

                case 2:
                    System.out.println("Products currently rented:");
                    // Show rented products
                    voorraadstatus.showRentedProducts();
                    System.out.println("Enter the index of the product you want to return:");
                    int returnIndex = scanner.nextInt();
                    voorraadstatus.returnProduct(returnIndex);
                    break;

                case 3:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }

}






