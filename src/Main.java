import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String inputWord = scanner.nextLine();

        if (inputWord.length() >= 2) {
            String middleLetters = inputWord.substring((inputWord.length() - 1) / 2, (inputWord.length() + 2) / 2);
            String modifiedWord = middleLetters + inputWord;
            System.out.println("Wynik: " + modifiedWord);
        } else {
            System.out.println("Wyraz musi mieć co najmniej 2 litery.");
        }
    }
}