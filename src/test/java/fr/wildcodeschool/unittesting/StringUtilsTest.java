package fr.wildcodeschool.unittesting;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    String pourTestCaractereCapitale = new fr.wildcodeschool.unittesting.StringUtils().vowels("Etest123");
    String pourTestCaractereAccentue = new fr.wildcodeschool.unittesting.StringUtils().vowels("é");
    String pourTestCaractereIndefini = new fr.wildcodeschool.unittesting.StringUtils().vowels(null);


    @Test
    public void caractereCapitale (){
        assertEquals("Ee", pourTestCaractereCapitale);
    }


    @Test
    public void chaineAccentue(){
        assertEquals("é", pourTestCaractereAccentue);
    }


    @Test
    public void chaineIndefini(){
        assertEquals("", pourTestCaractereIndefini);
    }
}
