package sahin.Kodlama.io.Devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateFrameworkRequest {
    private int id;
    private String languageName;
    private String name;
}
