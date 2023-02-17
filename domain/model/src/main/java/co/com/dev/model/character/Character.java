package co.com.dev.model.character;


import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Character {

    private Integer id;
    private String name;
    private Status status;
    private String species;
    private String type;
    private Gender gender;
    private Origin origin;
    private Location location;
    private String image;
    private List<String> episode;
    private String url;
    private LocalDateTime created;


}
