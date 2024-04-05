package Group.med.voll.api.repositories;

import Group.med.voll.api.domain.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicosRepository extends JpaRepository<Medico,Long> {
}
