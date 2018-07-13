package days.first;


import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// objektas kad nuskaitytu is konsoles
       /* System.out.println("iveskite zodi");
        String word = scanner.nextLine();
        System.out.println(word);*/
       //pridetas komentaras
        getCorrect(scanner);


    }

    private static void getCorrect(Scanner sc) {
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = sc.nextLine().toLowerCase();
            printWord(word);
        } while (!word.equals("pabaiga"));
    }

    private static void printWord(String word) {
        int count = countLetters(word, 'a');
        if (word.length() % 2 == 0) {
            System.out.println("ivestas zodis " + word + " lyginis,jo ilgis yra "+ word.length() + " a raidziu " + count);
        } else {
            System.out.println("ivestas zodis " + word + " nelyginis,jo ilgis yra "+ word.length() + " a raidziu " + count);
        }
    }

    private static int countLetters(String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (letter == temp) {
                result++;
            }
        }
        return result;
    }
}
