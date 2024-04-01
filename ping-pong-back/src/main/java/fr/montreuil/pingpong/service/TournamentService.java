package fr.montreuil.pingpong.service;

import fr.montreuil.pingpong.domain.entities.Tournament;
import fr.montreuil.pingpong.domain.view.TournamentRequestDTO;
import fr.montreuil.pingpong.domain.view.TournamentResponseDTO;
import fr.montreuil.pingpong.repo.TournamentRepo;
import fr.montreuil.pingpong.rest.mapper.TournamentAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class TournamentService implements ITournamentService {

    private final TournamentRepo tournamentRepo;

    @Override
    public TournamentResponseDTO createTournament(TournamentRequestDTO req) {

        // step 1/3: unmarshall, check inputs
        String name = Objects.requireNonNull(req.name);
        if (name.length() < 3) {
            throw new IllegalArgumentException("name too short");
        }
        Tournament alreadyFound = tournamentRepo.findByName(name);
        if (alreadyFound != null) {
            throw new IllegalArgumentException("name already used");
        }

        // step 2/3: business code
        // OK, create
        Tournament entity = new Tournament();
        entity.name = name;
        entity = tournamentRepo.save(entity);

        // step 3/3: marshall output (DTO, not internal entity)
        return TournamentAssembler.fromEntity(entity);
    }

    @Override
    public List<TournamentResponseDTO> fetchAll() {
        return tournamentRepo.findAll()
                .stream()
                .map(TournamentAssembler::fromEntity)
                .toList();
    }
}