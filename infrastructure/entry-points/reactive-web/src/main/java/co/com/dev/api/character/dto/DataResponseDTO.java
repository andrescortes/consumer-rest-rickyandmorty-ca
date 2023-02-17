package co.com.dev.api.character.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DataResponseDTO {

    private InfoDTO info;
    private List<CharacterDTO> results;
}
