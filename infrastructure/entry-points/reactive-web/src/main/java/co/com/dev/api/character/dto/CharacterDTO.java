package co.com.dev.api.character.dto;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CharacterDTO {

    private Integer id;
    private String name;
    private StatusDTO status;
    private String species;
    private String type;
    private GenderDTO gender;
    private OriginDTO origin;
    private LocationDTO location;
    private String image;
    private List<String> episode;
    private String url;
    private LocalDateTime created;


}
