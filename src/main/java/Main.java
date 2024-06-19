import java.util.Scanner;


// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
// 33. Napisz program, który znajduje drugą najniższą liczbę w tablicy:
//- Program powinien wczytać tablicę liczb całkowitych wprowadzoną przez użytkownika.
//- Znaleźć drugą najniższą liczbę w tablicy.
//- Wyświetlić wynik.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę elementów w tablicy: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("nadajliczbe");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Nieistnieje taka liczba");
        } else {
            System.out.println("Wartosc drugiej najmniejszej liczby w tablicy to:" + secondSmallest);
        }
    }
}