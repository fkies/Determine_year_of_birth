import java.util.Scanner;

public class Determine {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Podaj pesel: ");
        String pesel = get.nextLine();
        char[] tablica=pesel.toCharArray();
        System.out.print("\nTwój rok urodzenia to: 19" +tablica[0]+tablica[1]);
    }
}
