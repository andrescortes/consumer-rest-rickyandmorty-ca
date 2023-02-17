package co.com.dev.model.character;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Info {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
