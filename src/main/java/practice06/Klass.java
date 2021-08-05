package practice06;

import java.text.MessageFormat;

public class Klass {
    private final int num;

    public Klass(int num) {
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", num);
    }
}
