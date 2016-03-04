package demo.annotations;

import javax.annotation.Resource;

import demo.di.SpellChecker;

public class TextEditor4 {

    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Resource(name = "spell_checker")
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("TextEditor4: setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkSpelling() {
        spellChecker.checkSpelling();
    }
}
