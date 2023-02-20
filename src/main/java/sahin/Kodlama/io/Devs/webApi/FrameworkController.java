package sahin.Kodlama.io.Devs.webApi;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sahin.Kodlama.io.Devs.business.abstracts.IFrameworkServices;
import sahin.Kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;

import java.util.List;

@RestController //Annotation
@RequestMapping("/api/framework")
@AllArgsConstructor
public class FrameworkController {
    private IFrameworkServices frameworkServices;

    @GetMapping("/getAll")
    public List<GetAllFrameworkResponse> getAll() {
        return frameworkServices.getAllFramework();
    }

    @PutMapping()
    public void updateFramework(@RequestBody UpdateFrameworkRequest updateFrameworkRequest) {
        this.frameworkServices.updateFramework(updateFrameworkRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteFramework(@PathVariable int id) {
        this.frameworkServices.delete(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addFramework(@RequestBody CreateFrameworkRequest createFrameworkRequest) {
        this.frameworkServices.addFramework(createFrameworkRequest);
    }
}
