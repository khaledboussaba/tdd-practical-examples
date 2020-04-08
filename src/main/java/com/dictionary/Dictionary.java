package com.dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String dictionaryName;
    private Map<String, List<String>> multipleTranslations = new HashMap<>();

    public Dictionary(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public String getDictionaryName() {
        return "my dictionary";
    }

    public void addTranslation(String wordToTranslate, List<String> wordTranslations) {
        multipleTranslations.put(wordToTranslate, wordTranslations);
    }

    public Map<String, List<String>> getMultipleTranslations() {
        return multipleTranslations;
    }

    public List<String> getMultipleTranslations(String wordToTranslate) {
        return multipleTranslations.get(wordToTranslate);
    }

}