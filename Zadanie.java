package com.github.anieweglowska.helloword;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        String[] tablica = {"Monika", "Ola", "Ala"};
        int sum = 0;
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum += tablica[i].length();
        }
        System.out.println(sum);







//        System.out.println("Podaj piersza liczbę: ");
//        Scanner scanner = new Scanner(System.in);
//        int liczba = scanner.nextInt();
//        System.out.println("Poodaj drugą liczbę:");
//        int liczba2 = scanner.nextInt();
//        if (liczba2 == 0) {
//            System.out.println("Podałeś 0, nie można dzielić przez 0.");
//        } else {
//            double wynik = (double) liczba / liczba2;
//            System.out.println(wynik);
//        }


//        int a = 3;
//
//        do {
//            System.out.println(a);
//            a++;
//        } while (a < 10);
//        while (a < 10){
//            System.out.print("Java is great!");
//            a++;
//        }
    }
}
