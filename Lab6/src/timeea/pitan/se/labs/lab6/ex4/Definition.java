package timeea.pitan.se.labs.lab6.ex4;

import java.util.Objects;

public class Definition {
    String description;

    Definition(){}

    Definition(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        Definition test=(Definition) obj;
        return Objects.equals(test.description, description);
    }
}
