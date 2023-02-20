package sahin.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import sahin.Kodlama.io.Devs.entities.LanguageFramework;

public interface IDataAccessForFrameworks extends JpaRepository<LanguageFramework, Integer> {
}
