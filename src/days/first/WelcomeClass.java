package days.first;

//psvm sukuria main medota
//ctrl+alt+l sulygiuoja
public class WelcomeClass {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);

        //kaip iskviesti statini?
        minus(12,6);
        //kaip iskviesti ne statini metoda?
        WelcomeClass welcomeClass = new WelcomeClass();// sukuriamas objektas
        welcomeClass.printName ("Arturas");
        System.out.println(minus(12,6));
    }

    private void printName(String name) {
        //sout sukuria System.out.printLn()
        System.out.println(name);


    }

    private static int minus(int numb, int numb2) {

        return numb - numb2;
    }
}