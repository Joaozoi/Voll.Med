package med.voll.api.pacientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Long, Paciente> {
}
