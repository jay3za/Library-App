package fingerprintsoft.resource.interfaces;

import java.util.List;

//import fingerprintsoft.domain.Book;
//import fingerprintsoft.domain.interfaces.IAuthor;
import fingerprintsoft.domain.interfaces.IBook;

public interface IBookResource {
    List findBooks();

    List findBooks(String name);

    void insert(IBook book);

    void update(IBook book);

    IBook delete(Long id);

    IBook getAuthor(Long id);
}
