package fr.montreuil.pingpong.service;

import fr.montreuil.pingpong.domain.view.TournamentRequestDTO;
import fr.montreuil.pingpong.domain.view.TournamentResponseDTO;

import java.util.List;

public interface ITournamentService {

    TournamentResponseDTO createTournament(TournamentRequestDTO req);

    List<TournamentResponseDTO> fetchAll();
}