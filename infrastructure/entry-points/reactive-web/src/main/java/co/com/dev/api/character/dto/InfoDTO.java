package co.com.dev.api.character.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class InfoDTO {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
