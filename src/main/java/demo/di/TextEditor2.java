package demo.di;

public class TextEditor2 {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    
    public void checkSpelling() {
        spellChecker.checkSpelling();
    }
}
