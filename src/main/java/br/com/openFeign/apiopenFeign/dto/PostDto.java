package br.com.openFeign.apiopenFeign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostDto {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
