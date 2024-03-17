package service;

import Repositories.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.dto.GenreDto;
import ru.itgirl.libraryproject.model.Genre;

import java.util.List;
@Service
@RequiredArgsConstructor

public class GenreServiceImpl implements GenreService {
        private final GenreRepository genreRepository;

        @Override
        public GenreDto getGenreById(Long id) {
            Genre genre = genreRepository.findById(id).orElseThrow();
            return convertToDto(genre);
        }

        private GenreDto convertToDto(Genre genre) {
            List<BookDto> bookDtoList = genre.getBooks()
                    .stream()
                    .map(book -> BookDto.builder()
                            .genre(genre.getName())
                            .id(genre.getId())
                            .build()
                    ).toList();
            return GenreDto.builder()
                    .id(genre.getId())
                    .name(genre.getName())
                    .build();
        }

    }

