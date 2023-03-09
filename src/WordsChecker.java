import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String[] text;
    protected Set<String> words = new HashSet<String>();
    public WordsChecker(String text){
        this.text=(text.split("\\P{IsAlphabetic}+"));
        for (int i=0; i<this.text.length;i++){
            words.add(this.text[i]);
        }
    }
    public boolean hasWord(String word){
        if (words.contains(word)){
            return true;
        }
        return false;

    }
}
