package ru.itgirl.libraryproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
public class BookDto {
    private Long id;
    private String name;
    private String genre;
}