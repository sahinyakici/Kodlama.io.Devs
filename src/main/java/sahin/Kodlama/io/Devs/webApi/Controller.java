package sahin.Kodlama.io.Devs.webApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sahin.Kodlama.io.Devs.business.abstracts.ILanguageServices;
import sahin.Kodlama.io.Devs.entities.Language;

import java.util.List;

@RestController //Annotation
@RequestMapping("/api/language")
public class Controller {
    private ILanguageServices languageServices;

    @Autowired
    public Controller(ILanguageServices languageServices) {
        this.languageServices = languageServices;
    }

    @GetMapping("/getAll")
    public List<Language> getAll() {
        return languageServices.getAll();
    }

    @GetMapping("/updateLanguage")
    public void updateLanguage(@RequestParam int languageId, @RequestParam String newName) {
        languageServices.updateLanguage(languageId, newName);
    }

    @GetMapping("/deleteLanguageWithParam")
    public void deleteLanguageWithParam(@RequestParam int languageId) {
        languageServices.deleteLanguage(languageId);
    }

    @GetMapping("/addLanguage")
    public void addLanguage(@RequestParam int languageId, @RequestParam String languageName) throws Exception {
        Language language = new Language(languageId, languageName);
        languageServices.addLanguage(language);
    }
}
