package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.*;

public abstract class Book extends AbstractEntity implements IBook {

    private String name;
    private int number;
    private IAuthor author;
    private ICategory category;
    private IMediaType mediaType;

    protected Book(IMediaType mediaType) {
        setMediaType(mediaType);
    }
    
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return author
     */
    public IAuthor getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(IAuthor author) {
        this.author = author;
    }

    /**
     * @return category
     */
    public ICategory getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(ICategory category) {
        this.category = category;
    }

    /**
     * @return mediaType
     */
    public IMediaType getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType
     */
    public void setMediaType(IMediaType mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * @param string
     */
    public void setAuthor(String autor) {
    }

}