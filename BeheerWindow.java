import java.util.Scanner;

public class BeheerWindow extends Voorraadstatus{
    private Voorraadstatus voorraadstatus;

    public void showProductClasses() {
        System.out.println("Dit zijn de bekende soort producten");
        System.out.println();
        System.out.println("1. Boormachine");
        System.out.println("2. Personenauto");
        System.out.println("3. Vrachtwagen");
        System.out.println();

        // Prompt the user to choose a product type
        System.out.print("Kies een producttype (1-3): ");

        // Read the user's input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Create a new object of the chosen product type
        BoormachineFactory boormachineFactory = new BoormachineFactory();
        PersonenautoFactory personenautoFactory;
        VrachtwagenFactory vrachtwagenFactory;
        switch (choice) {
            case 1:
                boormachineFactory.createBoormachineDoorUser();
                break;
            case 2:
//                product = new Personenauto();
                break;
            case 3:
//                product = new Vrachtwagen();
                break;
            default:
                System.out.println("Ongeldige keuze!");
                return;
        }

        // Save the new product to the 'voorraad' ArrayList in Voorraadstatus
//        voorraadstatus.voegProductAanVoorraad();

        System.out.println("Nieuw product is toegevoegd aan de voorraad.");
    }
}
