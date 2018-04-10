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
    public void seulementVoyelle(){
        assertEquals("aeiouy", StringUtils.vowels("aeiouy"));
    }

    @Test
    public void voyelleDerniereLettre(){
        assertEquals("y", StringUtils.vowels("pfjgky"));
    }

    @Test
    public void pasDeVoyelle(){
        assertEquals("", StringUtils.vowels("hdjfklsm"));
    }

    @Test
    public void longueChaine(){
        assertEquals("iuoioyuiyuioiueaeiouayy", StringUtils.vowels("dfrtiuoplkiojhgtyuidhgyuiklmpoiufdsetaeissouggmlpatysy"));
    }

    @Test
    public void unCaractereVoyelle(){
        assertEquals("a", StringUtils.vowels("a"));
    }

    @Test
    public void unCaractereConsonne(){
        assertEquals("", StringUtils.vowels("D"));
    }


}
