import java.util.Scanner;

class BoormachineFactory extends CreateProductFactory {
    Voorraadstatus voorraadstatus;
    @Override
    public Boormachine createBoormachine(String merk, String type, String beschrijving) {
        return super.createBoormachine(merk, type, beschrijving);
    }

    public void createBoormachineDoorUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het merk van de boormachine:");
        String merk = scanner.nextLine();

        System.out.println("Geef het type van de boormachine:");
        String type = scanner.nextLine();

        System.out.println("Geef een beschrijving van de boormachine:");
        String beschrijving = scanner.nextLine();

        // Maak een nieuwe boormachine met behulp van de ingevoerde gegevens
        Boormachine boormachine = createBoormachine(merk, type, beschrijving);

        // Return de gecreëerde boormachine
        voorraadstatus.voegProductenAanVoorraad(boormachine);
    }
}
