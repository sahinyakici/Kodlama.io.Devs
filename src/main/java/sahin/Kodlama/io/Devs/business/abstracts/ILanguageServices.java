package sahin.Kodlama.io.Devs.business.abstracts;

import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;

public interface ILanguageServices {
    public List<Language> getAll();
    Language getLanguageWithId(int id);

    void updateLanguage(int languageId, String newName);

    void addLanguage(Language language) throws Exception;

    void deleteLanguage(int language);
}
