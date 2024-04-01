package fr.montreuil.pingpong.domain.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

@NoArgsConstructor
@AllArgsConstructor
public class TournamentResponseDTO {

    @JsonProperty(value = "id", access = READ_ONLY)
    public String id;

    @JsonProperty(value = "name")
    public String name;
}