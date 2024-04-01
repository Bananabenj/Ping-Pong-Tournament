package fr.montreuil.pingpong.rest;


import fr.montreuil.pingpong.domain.view.TournamentRequestDTO;
import fr.montreuil.pingpong.domain.view.TournamentResponseDTO;
import fr.montreuil.pingpong.service.ITournamentService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournament")
@RequiredArgsConstructor
@OpenAPIDefinition(
        // tags = { Tag("Tournament") }
)

public class TournamentRestController {

    private final ITournamentService tournamentService;

    @PostMapping()
    @Operation(summary = "Create a new (unique by name) tournament")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success"),
            @ApiResponse(responseCode = "500", description = "error")
    })
    public TournamentResponseDTO createTournament(
            @RequestBody TournamentRequestDTO req) {
        System.out.println("donnée recu :" + req);
        return tournamentService.createTournament(req);
    }

    @GetMapping()
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success"),
            @ApiResponse(responseCode = "500", description = "error")
    })
    public List<TournamentResponseDTO> fetchAll() {
        System.out.println("coucou");
        return tournamentService.fetchAll();
    }
}