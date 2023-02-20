package sahin.Kodlama.io.Devs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "frameworks")
public class LanguageFramework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "languageName")
    private String languageName;
    @Column(name = "frameworkName")
    private String name;
}
