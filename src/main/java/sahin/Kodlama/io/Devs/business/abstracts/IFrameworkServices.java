package sahin.Kodlama.io.Devs.business.abstracts;

import sahin.Kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.requests.UpdateFrameworkRequest;
import sahin.Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;
import sahin.Kodlama.io.Devs.business.responses.GetByIdFrameworkResponse;

import java.util.List;

public interface IFrameworkServices {
    public List<GetAllFrameworkResponse> getAllFramework();
    public GetByIdFrameworkResponse getByIdFramework(int id);
     void updateFramework(UpdateFrameworkRequest updateFrameworkRequest);
     void delete(int frameworkId);
     void addFramework(CreateFrameworkRequest createFrameworkRequest);
}
