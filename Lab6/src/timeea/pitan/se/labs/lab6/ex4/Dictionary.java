package timeea.pitan.se.labs.lab6.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    Word w;
    Definition d;
    HashMap<Word,Definition> dictionary=new HashMap<Word,Definition>();

    public void addWord(Word w, Definition d){
        dictionary.put(w,d);
    }

    public void getDefinition(Word w) {
        for (Word word : dictionary.keySet()) {
            if (word.equals(w)) {
                System.out.println(dictionary.get(word).getDescription());
            }
        }
    }

    public void getAllWords(){
        dictionary.forEach((w,d)-> System.out.println(w.getName()));
    }

    public void getAllDefinitions(){
        dictionary.forEach((w,d)->System.out.println(d.getDescription()));
        }
    }
