package med.voll.api.endereco;

import med.voll.api.medicos.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long > {
}
