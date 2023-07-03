import java.util.Scanner;

public interface Huurprocedure {
//    Scanner scanner = new Scanner(System.in);
    double euro = 0;
//    int dag = scanner.nextInt();
    public void berekenHuurprijsZonderVerzekering(int dag);
    public void berekenVerzekering(int dag);
    public void berekenHuurprijsMetVerzekering(int dag);
    public String showBeschrijving();
}
