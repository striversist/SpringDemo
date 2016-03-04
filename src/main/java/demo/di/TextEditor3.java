package demo.di;

public class TextEditor3 {

    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
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
