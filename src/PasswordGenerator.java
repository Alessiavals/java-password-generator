import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il nome");
        String nome = scan.nextLine();

        System.out.println("Inserisci il cognome");
        String cognome = scan.nextLine();

        System.out.println("Inserisci colore preferito");
        String colore = scan.nextLine();

        System.out.println("Inserisci data di nascita");
        int dataNascita = scan.nextInt();

        System.out.println("La password generata è " + nome + "-" + cognome + "-" + colore + "-" + dataNascita);
    }
}
