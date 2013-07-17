package fingerprintsoft.domain.interfaces;

/**
 * @author jackie
 */
public interface IPhysicalMediaType extends IMediaType {
    
    /**
     * Returns the media cover type of the book
     * @return
     */
    String getCoverType();

    /**
     * Sets the media cover type of the book
     * @param mediaCoverType
     */
    void setCoverType(String coverType);
    
}
