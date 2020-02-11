import java.util.Scanner;
public class translatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Nationalities = {"canadian", "minnesota", "redneck", "australia"};
        String choice;
        while (true) {
            System.out.println("What nationality would you like to translate to?");
            for (int x = 0; x <= Nationalities.length - 1; x++) { System.out.println(Nationalities[x]); }
            System.out.println("\nPlease check spelling before entering!");
            choice = input.nextLine();
            System.out.println("You have chosen " + choice);
            if (ChoiceReal(choice.toLowerCase(), Nationalities)) { break; }
            else { System.out.println("INVALID OPTION\nPlease enter a new option"); }
        }
        System.out.println("Please enter the sentence you would like to translate to "+choice+":");
        String translateSentence = input.nextLine();
        System.out.println("Translating...");
        translate(translateSentence, choice.toLowerCase());
    }

    private static boolean ChoiceReal(String CheckChoice, String[] options) {
        for(int x = 0; x<options.length;x++){
            if(options[x].equals(CheckChoice)){ return true; }
        }
        return false;
    }

    private static void translate(String transSentence, String transChoice){
        Language transLang = new Language(transSentence, transChoice);
        System.out.println((transLang.translate()));
    }
}

