package it.devlec.applicazionerestspring.persistenza;

import it.devlec.applicazionerestspring.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtentiRepository extends JpaRepository<Utente, Long> {
}
