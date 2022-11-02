package sahin.Kodlama.io.Devs.dataAccess.abstracts;

import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;

public interface IDataAccess {
    List<Language> getAll();
    void updateLanguage(int language,String newName);

    void addLanguage(Language language) throws Exception;

    void deleteLanguage(int language);
}
