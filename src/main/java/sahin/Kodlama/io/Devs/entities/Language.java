package sahin.Kodlama.io.Devs.entities;

public class Language {
    private int id;
    private String language;

    public Language() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Language(int id, String language) {
        this.id = id;
        this.language = language;
    }
}
