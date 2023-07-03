import java.util.Scanner;

abstract class Window implements Subscriber{
    public void DisplayWindow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maak een keuze:");
        System.out.println();
        System.out.println("1. Overzicht");
        System.out.println("2. Beheer");
        System.out.println("3. Uitloggen");
        System.out.print("Uw keuze:");
        System.out.println();
    }
    public void DetailsWindow(){
        Voorraadstatus status = new Voorraadstatus();
//        status.voegProductAanVoorraad();
        status.showVolleInfoVoorraad();
    }
    public void Inloggen(){}
    public void NieuwProductVoorraad(){}
    public void Uitloggen(){}

    @Override
    public void update(String newState) {
        System.out.println(" received an update. New state: " + newState);
    }
}
