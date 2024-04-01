package fr.montreuil.pingpong.domain.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
public class Tournament {

    @Id
    public String id;
    public String name;

}