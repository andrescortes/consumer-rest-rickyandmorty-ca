package co.com.dev.model.location;

import lombok.Builder;
import lombok.Data;

@Data

@Builder(toBuilder = true)
public class Location {

    private String name;
    private String url;
}
