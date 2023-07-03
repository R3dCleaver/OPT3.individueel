import java.util.Scanner;

public class LoginHandler {
    public void loginLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            loggedIn = UsersMap.AuthorizeUser(username, password);

            if (loggedIn) {
                System.out.println("U bent ingelogged");
            }
            else {
                System.out.println("Niet gelukt! Probeer opnieuw");
            }
        }
    }
}
