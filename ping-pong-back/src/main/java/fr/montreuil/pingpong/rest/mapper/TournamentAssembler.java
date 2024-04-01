package fr.montreuil.pingpong.rest.mapper;

import fr.montreuil.pingpong.domain.entities.Tournament;
import fr.montreuil.pingpong.domain.view.TournamentResponseDTO;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class TournamentAssembler {

    public static TournamentResponseDTO fromEntity(Tournament tournament) {
        return new TournamentResponseDTO(
                tournament.id,
                tournament.name
        );
    }

    public static Tournament fromDTO(TournamentResponseDTO tournamentResponseDTO) {
        return new Tournament(
                tournamentResponseDTO.id,
                tournamentResponseDTO.name
        );
    }
}

