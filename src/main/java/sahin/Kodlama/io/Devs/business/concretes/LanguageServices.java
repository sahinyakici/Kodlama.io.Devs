package sahin.Kodlama.io.Devs.business.concretes;

import org.springframework.stereotype.Service;
import sahin.Kodlama.io.Devs.business.abstracts.ILanguageServices;
import sahin.Kodlama.io.Devs.dataAccess.abstracts.IDataAccess;
import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;

@Service
public class LanguageServices implements ILanguageServices {
    private IDataAccess dataAccess;

    public LanguageServices(IDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    @Override
    public List<Language> getAll() {
        return dataAccess.getAll();
    }

    @Override
    public Language getLanguageWithId(int id) {
        return dataAccess.getAll().get(id);
    }

    @Override
    public void updateLanguage(int languageId, String newName) {
        dataAccess.updateLanguage(languageId, newName);
    }

    @Override
    public void addLanguage(Language language) throws Exception {
        dataAccess.addLanguage(language);
    }

    @Override
    public void deleteLanguage(int language) {
        dataAccess.deleteLanguage(language);
    }
}
