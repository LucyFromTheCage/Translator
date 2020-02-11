public class Language {
    private String words;
    private String langChoice;
    private char lastChar;

    public Language(String sentence, String newLang){
        if (sentence.contains(".") || sentence.contains("?") || sentence.contains("!")) {
            words = sentence.substring(0, sentence.length() - 1);
            lastChar = sentence.charAt(sentence.length()-1);
        } else {
            words = sentence;
        }
        langChoice = newLang;
    }

    public String translate(){
        if(langChoice.equals("canadian")) {
            canadian langCan = new canadian(words);
            words = langCan.toString()+lastChar;
        }else if(langChoice.equals("minnesota")) {
            minnesota langMin = new minnesota(words);
            words = langMin.toString()+lastChar;
        }else if(langChoice.equals("redneck")){
            redneck langRed = new redneck(words);
            words = langRed.toString()+lastChar;
        }else if(langChoice.equals("australia")){
            australia langAus = new australia(words);
            words = langAus.toString()+lastChar;
        }
        return words;
    }
}
