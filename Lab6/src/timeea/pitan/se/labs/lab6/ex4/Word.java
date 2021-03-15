package timeea.pitan.se.labs.lab6.ex4;

import java.util.Objects;

public class Word {
    String name;

    Word(){}

    Word(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
       Word w=(Word)obj;
       return Objects.equals(w.name,name);
    }
    @Override
    public int hashCode() {
       return name.hashCode();
        //return Objects.hash(name);
    }
}
