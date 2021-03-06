package fingerprintsoft.domain.interfaces;

/**
 * @author Jackie
 */
public interface IMediaType extends IEntity {

    /**
     * Returns the media type of the book
     * @return
     */
    String getType();

    /**
     * Sets the media type of the book
     * @param mediaType
     */
    void setType(String type);
    
}
