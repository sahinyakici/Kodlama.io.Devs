package sahin.Kodlama.io.Devs.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sahin.Kodlama.io.Devs.business.abstracts.IFrameworkServices;
import sahin.Kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;
import sahin.Kodlama.io.Devs.business.responses.GetByIdFrameworkResponse;
import sahin.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import sahin.Kodlama.io.Devs.dataAccess.abstracts.IDataAccessForFrameworks;
import sahin.Kodlama.io.Devs.entities.LanguageFramework;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FrameworkServices implements IFrameworkServices {
    private IDataAccessForFrameworks dataAccess;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllFrameworkResponse> getAllFramework() {
        List<LanguageFramework> framework = dataAccess.findAll();
        List<GetAllFrameworkResponse> responses = framework.stream().map(response -> this.modelMapperService.forResponse().map(response, GetAllFrameworkResponse.class)).collect(Collectors.toList());
        return responses;
    }

    @Override
    public GetByIdFrameworkResponse getByIdFramework(int id) {
        LanguageFramework framework = dataAccess.findById(id).orElseThrow();
        GetByIdFrameworkResponse response = this.modelMapperService.forResponse().map(framework, GetByIdFrameworkResponse.class);
        return response;
    }

    @Override
    public void updateFramework(UpdateFrameworkRequest updateFrameworkRequest) {
        LanguageFramework framework = this.modelMapperService.forRequest().map(updateFrameworkRequest, LanguageFramework.class);
        this.dataAccess.save(framework);
    }

    @Override
    public void delete(int frameworkId) {
        this.dataAccess.deleteById(frameworkId);
    }

    @Override
    public void addFramework(CreateFrameworkRequest createFrameworkRequest) {
        LanguageFramework framework = this.modelMapperService.forRequest().map(createFrameworkRequest, LanguageFramework.class);
        this.dataAccess.save(framework);
    }
}
