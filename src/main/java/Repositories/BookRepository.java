package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}