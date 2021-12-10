package L4;

import java.util.*;

public class CW4_2 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        String Text = "Java is a programming language that is concurrent , classbased and object-oriented .";
        String[] words = Text.split(" ");
        for (String Word : words) {
            if (Word.equals(",") || Word.equals(".") || Word.length()<= 3) {
                Word = null;
            } else {
                string.add(Word);
        System.out.println(Word);

    }
}
    }
}