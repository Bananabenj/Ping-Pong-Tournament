package fr.montreuil.pingpong.domain.view;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TournamentRequestDTO {

    @JsonProperty(value = "name")
    public String name;
}