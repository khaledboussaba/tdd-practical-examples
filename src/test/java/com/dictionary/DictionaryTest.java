package com.dictionary;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DictionaryTest {

    private Dictionary dictionary;

    @Before
    public void initialize() {
        dictionary = new Dictionary("my dictionary");
    }

    @Test
    public void dictionaryName() {
        assertEquals("my dictionary", dictionary.getDictionaryName());
    }

    @Test
    public void noTranslationFound() {
        assertEquals(0, dictionary.getMultipleTranslations().size());
    }

    @Test
    public void translateFrenchWordToEnglish() {
        dictionary.addTranslation("contre", Arrays.asList("against"));
        assertEquals(Arrays.asList("against"), dictionary.getMultipleTranslations("contre"));
    }

    @Test
    public void translateOtherFrenchWordToEnglish() {
        dictionary.addTranslation("jouer", Arrays.asList("play"));
        assertEquals(Arrays.asList("play"), dictionary.getMultipleTranslations("jouer"));
    }

    @Test
    public void multipleTranslationsOfFrenchWord() {
        List<String> translations = Arrays.asList("father", "dad");
        dictionary.addTranslation("papa",  translations);
        assertEquals(translations, dictionary.getMultipleTranslations("papa"));
    }

    @Test
    public void translateEnglishWordToFrench() {
        List<String> translations = Arrays.asList("maman", "mere");
        dictionary.addTranslation("mother",  translations);
        assertEquals(translations, dictionary.getMultipleTranslations("mother"));
    }

}
