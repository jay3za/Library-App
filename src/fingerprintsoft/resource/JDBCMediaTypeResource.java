package fingerprintsoft.resource;

//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.List;
//import fingerprintsoft.database.LibraryConnection;
import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;
import fingerprintsoft.resource.interfaces.IMediaTypeResources;

/**
 * @author jackie
 */
public class JDBCMediaTypeResource implements IMediaTypeResources{
    /**
     * Fetches the list of media types
     * @return mediaType
     */
    public List getMediaType() {
        return null;
    }

    /**
     * inserts a new media type for type 
     */
    public void insert(MediaType mediaType) {

    }

    /**
     * allows update on media type for type
     */
    public void update(MediaType mediaType) {

    }

    /**
     * allows media type to be deleted and returns null to cover type
     */
    public MediaType delete(String coverType) {
        return null;
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#findMediaType()
     */
    public List findMediaType() {
        return null;
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#findMediaType(java.lang.String)
     */
    public List findMediaType(String name) {
        return null;
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#insert(fingerprintsoft.domain.interfaces.IMediaType)
     */
    public void insert(IMediaType mediaType) {
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#update(fingerprintsoft.domain.interfaces.IMediaType)
     */
    public void update(IMediaType mediaType) {
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#delete(java.lang.Long)
     */
    public IMediaType delete(Long id) {
        return null;
    }

    /**
     * @see fingerprintsoft.resource.interfaces.IMediaTypeResources#getAuthor(java.lang.Long)
     */
    public IMediaType getAuthor(Long id) {
        return null;
    }

}
