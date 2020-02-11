public class canadian{
    private String ending = ", eh";
    private String words;

    public canadian(String sentence) { words = sentence; }

    public String toString() { return words + " " + ending; }
}
