package fingerprintsoft.resource.interfaces;

import java.util.List;
import fingerprintsoft.domain.Author;
import fingerprintsoft.domain.interfaces.IAuthor;

/**
 * @author jackie
 */
public interface IAuthorResource {
    List findAuthors();

    List findAuthors(String name);

    void insert(IAuthor author);

    void update(IAuthor author);

    IAuthor delete(Long id);

  //  IAuthor getAuthor(Long id);

	public Author getNames();

}
