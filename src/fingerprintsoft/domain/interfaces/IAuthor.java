package fingerprintsoft.domain.interfaces;

public interface IAuthor extends IEntity {
    
    /**
     * Returns the name of the Author
     * @return name
     */
    String getName();

    /**
     * Sets the name of the Author
     * @param name
     */
    void setName(String name);

}
