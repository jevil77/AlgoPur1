import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le texte de votre hashtag :");
        String hashtag = sc.nextLine();



        String resultat = "#";


        if (hashtag.length() +1 > 141) {
            System.out.println(false);
            return;
        }

        for (int i = 0; i < hashtag.length(); i++) {
            char c = hashtag.charAt(i);

            if (i == 0) {
                resultat += Character.toUpperCase(c);
            } else {
                resultat += Character.toLowerCase(c);
            }
        }

        System.out.println(resultat);
    }
}
