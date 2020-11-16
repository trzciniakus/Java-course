package CH12.MapTraining;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high-level, object orientated");
        languages.put("Python", "an interpreted, object orientated");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java","This course is aboutJava");
        }

        System.out.println(languages.get("Java"));

        System.out.println("=============");

        languages.remove("Lisp");

        if(languages.remove("Algol","a family of all")){
            System.out.println("Algol removed");
        } else{
            System.out.println("This key/value pair does not exists");
        }

        System.out.println(languages.replace("Lisp","a functional"));

        for(String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
