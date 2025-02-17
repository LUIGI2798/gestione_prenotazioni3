package it.epicode.gestione_prenotazioni.service;



import it.epicode.gestione_prenotazioni.model.Prenotazione;
import it.epicode.gestione_prenotazioni.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository repository;

    public List<Prenotazione> findAll() {
        return repository.findAll();
    }

    public Prenotazione save(Prenotazione prenotazione) {
        return repository.save(prenotazione);
    }
}
