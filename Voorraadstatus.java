import java.util.ArrayList;
import java.util.Scanner;

class Voorraadstatus implements Subject {
    ArrayList<Window> observers = new ArrayList<>();
    ArrayList<Product> voorraad = new ArrayList<>();
    ArrayList<Product> gehuurd = new ArrayList<>();
    String state;
    Scanner scanner = new Scanner(System.in);

    BoormachineFactory boormachineFactory = new BoormachineFactory();
    PersonenautoFactory personenautoFactory = new PersonenautoFactory();
    VrachtwagenFactory vrachtwagenFactory = new VrachtwagenFactory();

    Product bosch = boormachineFactory.createBoormachine("Bosch", "GSB 18V-21", " Een krachtige en veelzijdige boormachine, geschikt voor verschillende klussen in huis of op de bouwplaats.");
    Product makita = boormachineFactory.createBoormachine("Makita", "DHP482", " Een compacte en lichte boormachine met hoog koppel, ideaal voor precisiewerk en langdurig gebruik.");
    Product dewalt = boormachineFactory.createBoormachine("DeWalt", "DCD796", " Een professionele boormachine met uitstekende prestaties en duurzaamheid, geschikt voor intensief gebruik.");

    Product vw = personenautoFactory.createPersonenauto("Volkswagen", "Golf", "Een compacte en betrouwbare personenauto, ideaal voor stadsritten en lange afstanden.", 1200, 1600);
    Product toyota = personenautoFactory.createPersonenauto("Toyota", "Corolla", " Een populaire en zuinige personenauto met een ruim interieur en moderne functies.", 1100, 1400);
    Product bmw = personenautoFactory.createPersonenauto("BMW", "3 series", "Een luxe sedan met sportieve prestaties, elegant design en geavanceerde technologieën.", 1500, 2000);

    Product volvo = vrachtwagenFactory.createVrachtwagen("Volvo", "FH16", "Een krachtige vrachtwagen met hoog laadvermogen, ideaal voor zware transporten over lange afstanden.", 5000, 3000);
    Product mercedes = vrachtwagenFactory.createVrachtwagen("Mercedes-Benz", "Actros", "Een moderne vrachtwagen met geavanceerde veiligheidsvoorzieningen en efficiënte brandstoftechnologie.", 3500, 2500);
    Product scania = vrachtwagenFactory.createVrachtwagen("Scania", "R-series", " Een robuuste en betrouwbare vrachtwagen met veel laadruimte en comfortabele cabine voor de bestuurder.", 6000, 4000);


    public void productenInVoorraad() {
        voorraad.add(bosch);
        voorraad.add(makita);
        voorraad.add(dewalt);
        voorraad.add(vw);
        voorraad.add(toyota);
        voorraad.add(bmw);
        voorraad.add(volvo);
        voorraad.add(mercedes);
        voorraad.add(scania);
    }
    public void voegProductenAanVoorraad(Product product) {
        voorraad.add(product);
    }

    public void showAlleProductenOpVoorraadMetBeschrijving() {
        for (Product i : voorraad) {
            System.out.println("Merk: " + i.getMerk());
            System.out.println("Type: " + i.getType());
            System.out.println("Beschrijving: " + i.getBeschrijving());
            System.out.println();
        }
    }

    public void showVolleInfoVoorraad() {
        for (Product i : voorraad) {
            i.displayDetails();
        }
    }

    //InfoKeuze
    public void kiesProductEnShowDetails() {
        System.out.println("Kies een product:");
        System.out.println("1. Boormachine");
        System.out.println("2. Personenauto");
        System.out.println("3. Vrachtwagen");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showBoormachineDetails();
                break;
            case 2:
                showPersonenautoDetails();
                break;
            case 3:
                showVrachtwagenDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void showBoormachineDetails() {
        System.out.println("Kies een boormachine:");
        System.out.println("1. Bosch");
        System.out.println("2. Makita");
        System.out.println("3. DeWalt");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bosch.displayDetails();
                break;
            case 2:
                makita.displayDetails();
                break;
            case 3:
                dewalt.displayDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void showPersonenautoDetails() {
        System.out.println("Kies een personenauto:");
        System.out.println("1. Volkswagen");
        System.out.println("2. Toyota");
        System.out.println("3. BMW");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                vw.displayDetails();
                break;
            case 2:
                toyota.displayDetails();
                break;
            case 3:
                bmw.displayDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void showVrachtwagenDetails() {
        System.out.println("Kies een vrachtwagen:");
        System.out.println("1. Volvo");
        System.out.println("2. Mercedes-Benz");
        System.out.println("3. Scania");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                volvo.displayDetails();
                break;
            case 2:
                mercedes.displayDetails();
                break;
            case 3:
                scania.displayDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    //Huur keuze
    public void kiesProductEnBerekenHuur() {
        System.out.println("Kies een product:");
        System.out.println("1. Boormachine");
        System.out.println("2. Personenauto");
        System.out.println("3. Vrachtwagen");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showBoormachineDetails();
                break;
            case 2:
                showPersonenautoDetails();
                break;
            case 3:
                showVrachtwagenDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void displayProductDetails() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Maak een keuze: ");
            int index = scanner.nextInt();

            if (index == 0) {
                isRunning = false;
            } else if (index > 0 && index <= voorraad.size()) {
                Product product = voorraad.get(index - 1);

                if (product instanceof Product) {
                    Huurprocedure huurproduct = (Huurprocedure) product;

                    System.out.println("Enter the number of days for rent: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nHuurprijs zonder verzekering:");
                    huurproduct.berekenHuurprijsZonderVerzekering(days);

                    System.out.println("\nHuurprijs met verzekering:");
                    huurproduct.berekenHuurprijsMetVerzekering(days);

                    System.out.println("\nHuurprijs voor verzekering:");
                    huurproduct.berekenVerzekering(days);
                }
            } else {
                System.out.println("Invalid index!");
            }

        }
    }
    // Rent a product


    @Override
    public void registerObserver(Window window) {
        observers.add(window);
    }

    @Override
    public void removeObserver(Window window) {
        observers.remove(window);
    }

    @Override
    public void notifyObserver(String newState) {
        for (Window window : observers) {
            window.update(newState);
        }
    }
    public void setState(String newState) {
        state = newState;
        notifyObserver(newState);
    }
    public void rentProduct(int index) {
        if (index >= 0 && index < voorraad.size()) {
            Product product = voorraad.get(index);
            voorraad.remove(index);
            gehuurd.add(product);
            notifyObserver("Product gehuurd");
        } else {
            System.out.println("Fout, probeer onieuw.");
        }
    }

    // Return a product
    public void returnProduct(int index) {
        if (index >= 0 && index < gehuurd.size()) {
            Product product = gehuurd.get(index);
            gehuurd.remove(index);
            voorraad.add(product);
            notifyObserver("Product is weer op voorraad");
        } else {
            System.out.println("Probeer het opnieuw");
        }
    }

    public void showRentedProducts() {
        if (gehuurd.isEmpty()) {
            System.out.println("Geen product gehuurd.");
        } else {
            System.out.println("Volgende producten zijn gehuurd");
            for (Product product : gehuurd) {
                product.displayDetails();
                System.out.println();
            }
        }
    }
}


