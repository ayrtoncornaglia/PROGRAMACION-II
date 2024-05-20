
package TrabajoPractico3;

import java.util.Scanner;

public class ProcesamientoDeTweets {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un tweet (maximo 280 caracteres): ");
        String tweet = scanner.nextLine();

        int longitud = tweet.length();
        if (longitud > 280) {
            System.out.println("El tweet excede los 280 caracteres. Por favor, acortalo.");
            return;
        }

        System.out.print("Ingresa un hashtag: ");
        String hashtag = scanner.nextLine();
        StringBuilder tweetConHashtag = new StringBuilder(tweet);
        tweetConHashtag.append(" #").append(hashtag);

        System.out.print("Ingresa tu nombre de usuario de Twitter (sin '@'): ");
        String nombreUsuario = scanner.nextLine();

        tweetConHashtag.append(" @" + nombreUsuario);
        System.out.println("Tweet completo: " + tweetConHashtag);

        int caracteresTotales = tweetConHashtag.length();
        System.out.println("Cantidad total de caracteres: " + caracteresTotales);

        scanner.close();
    }
}
