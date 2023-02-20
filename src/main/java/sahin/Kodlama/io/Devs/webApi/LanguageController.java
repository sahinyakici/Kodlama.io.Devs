package sahin.Kodlama.io.Devs.webApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sahin.Kodlama.io.Devs.business.abstracts.ILanguageServices;
import sahin.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;

import java.util.List;

@RestController //Annotation
@RequestMapping("/api/language")
public class LanguageController {
    private ILanguageServices languageServices;

    @Autowired
    public LanguageController(ILanguageServices languageServices) {
        this.languageServices = languageServices;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll() {
        return languageServices.getAll();
    }

    @PutMapping()
    public void updateLanguage(@RequestBody() UpdateLanguageRequest updateLanguageRequest) {
        this.languageServices.updateLanguage(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguageWithParam(@PathVariable int languageId) {
        languageServices.deleteLanguage(languageId);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addLanguage(@RequestBody() CreateLanguageRequest createLanguageRequest) {
        this.languageServices.addLanguage(createLanguageRequest);
    }
}
