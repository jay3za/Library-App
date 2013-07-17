package fingerprintsoft.domain.interfaces;

import fingerprintsoft.domain.Book;

public interface IBook extends IEntity {

    /**
     * Returns the name of the Book
     * @return name of the book
     */
    String getName();

    /**
     * Sets the name of the Book
     * @param name
     */
    void setName(String name);

    /**
     * Returns the number of the book
     * @return
     */
    int getNumber();

    /**
     * Sets the number of the Book
     * @param number
     */
    void setNumber(int number);

    /**
     * Returns the Author of the book
     * @return
     */
    IAuthor getAuthor();

    /**
     * Sets the Author of the book
     * @param author
     */
    void setAuthor(IAuthor author);

    /**
     * @return category
     */
    ICategory getCategory();
    
    /**
     * @param category
     */
    void setCategory(ICategory category);

    /**
     * @return
     */
    IMediaType getMediaType();

    /**
     * @param mediaType
     */
    void setMediaType(IMediaType mediaType);

}
