package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itgirl.libraryproject.dto.GenreDto;
import service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @RestController
    @RequiredArgsConstructor


    public class GenreController {
        @Autowired

        private final GenreService genreService;

        @RequestMapping
        @GetMapping("/genre/{id}")
        GenreDto getGenreById(@PathVariable("id") Long id) {
            return genreService.getGenreById(id);
        }
    }

