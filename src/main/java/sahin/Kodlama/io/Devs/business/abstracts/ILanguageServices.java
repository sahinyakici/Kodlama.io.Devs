package sahin.Kodlama.io.Devs.business.abstracts;

import sahin.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import sahin.Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;

public interface ILanguageServices {
    public List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getLanguageWithId(int id);

    void updateLanguage(UpdateLanguageRequest updateLanguageRequest);

    void addLanguage(CreateLanguageRequest createLanguageRequest);

    void deleteLanguage(int language);
}
