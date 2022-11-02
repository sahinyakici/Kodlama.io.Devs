package sahin.Kodlama.io.Devs.dataAccess.concretes;

import org.springframework.stereotype.Repository;
import sahin.Kodlama.io.Devs.dataAccess.abstracts.IDataAccess;
import sahin.Kodlama.io.Devs.entities.Language;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDataAccess implements IDataAccess {
    List<Language> languages;

    public InMemoryDataAccess() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "C++"));
        languages.add(new Language(2, "C"));
        languages.add(new Language(3, "C#"));
        languages.add(new Language(4, "Java"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void updateLanguage(int languageId, String newName) {
        languages.remove(languageId);
        languages.add(new Language(languageId, newName));
    }

    @Override
    public void addLanguage(Language language) throws Exception {
        if (!languages.contains(language) && language.getLanguage() != null) {
            languages.add(language);
        } else {
            throw new Exception("Bu isimde bir dil var yada isim boş");
        }
    }

    @Override
    public void deleteLanguage(int language) {
        languages.remove(language);
    }
}
