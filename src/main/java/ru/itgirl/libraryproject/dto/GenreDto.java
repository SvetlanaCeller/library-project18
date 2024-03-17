package ru.itgirl.libraryproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
public class GenreDto {
    private Long id;
    private String name;
}
