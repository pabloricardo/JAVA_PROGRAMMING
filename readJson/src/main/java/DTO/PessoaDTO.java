package DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaDTO {
    String name;
    Integer age;
    @JsonProperty("languages")
    LanguagesDTO languages;
}