package LOTR;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private static final List<String> characterClassNames = new ArrayList<>();
    
    static {
        characterClassNames.add("Hobbit");
        characterClassNames.add("Elf");
        characterClassNames.add("King");
        characterClassNames.add("Knight");
    }

    public Character createCharacter(){
        Random random = new Random();
        
        String className = characterClassNames.get(random.nextInt(characterClassNames.size()));
        
        try{
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return (Character) constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
        
    }

    public Character fromString(String ch){
        try{
            Class<?> clazz = Class.forName(ch);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return (Character) constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }

}
