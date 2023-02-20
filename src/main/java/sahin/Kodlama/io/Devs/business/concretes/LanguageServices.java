package sahin.Kodlama.io.Devs.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sahin.Kodlama.io.Devs.business.abstracts.ILanguageServices;
import sahin.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import sahin.Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import sahin.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import sahin.Kodlama.io.Devs.dataAccess.abstracts.IDataAccess;
import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LanguageServices implements ILanguageServices {
    private IDataAccess dataAccess;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = dataAccess.findAll();
        List<GetAllLanguageResponse> languageResponses = languages.stream().map(language -> this.modelMapperService.forResponse().map(language, GetAllLanguageResponse.class)).collect(Collectors.toList());
        return languageResponses;
    }

    @Override
    public GetByIdLanguageResponse getLanguageWithId(int id) {
        Language language= this.dataAccess.findById(id).orElseThrow();
        GetByIdLanguageResponse response=this.modelMapperService.forResponse().map(language,GetByIdLanguageResponse.class);
        return response;
    }

    @Override
    public void updateLanguage(UpdateLanguageRequest updateLanguageRequest) {
        Language language = this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
        this.dataAccess.save(language);
    }

    @Override
    public void addLanguage(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest().map(createLanguageRequest, Language.class);
        this.dataAccess.save(language);
    }

    @Override
    public void deleteLanguage(int language) {
        dataAccess.deleteById(language);
    }
}
