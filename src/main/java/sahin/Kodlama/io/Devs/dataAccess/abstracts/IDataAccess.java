package sahin.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import sahin.Kodlama.io.Devs.entities.Language;

public interface IDataAccess extends JpaRepository<Language, Integer> {
}
