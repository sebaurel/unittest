package fr.wildcodeschool.unittesting;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    public StringUtils listeString;

    @BeforeEach
    public void initialisation(){
        StringUtils listeString = new StringUtils();
    }

    @Test
    public void voyellePremiereLettre (){
        assertEquals("Eea", StringUtils.vowels("Eerta"));
    }


    @Test
    public void caractereIndefini(){
        assertEquals("", StringUtils.vowels(null));
    }

    @Test
    public void pasDeVoyelle(){
        assertEquals("", StringUtils.vowels("hdjfklsm"));
    }

    //Test de la methode uniqueVowels ----------------------------
    @Test
    public void longueChaine(){
        assertEquals("oui", StringUtils.uniqueVowels("ouioui"));
    }

    @Test
    public void unCaractereVoyelle(){
        assertEquals("a", StringUtils.uniqueVowels("abba"));
    }

    @Test
    public void unCaractereConsonne(){
        assertEquals("O", StringUtils.uniqueVowels("hdjOfklsm"));
    }

}
