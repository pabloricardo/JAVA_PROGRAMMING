package DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LanguagesDTO {
    @JsonProperty("French")
    String french;
    @JsonProperty("German")
    String german;
    @JsonProperty("Spanish")
    String Spanish;
}
