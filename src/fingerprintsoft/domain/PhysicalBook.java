package fingerprintsoft.domain;

import fingerprintsoft.constants.PhysicalCoverTypes;
import fingerprintsoft.domain.interfaces.IMediaType;

/**
 * @author jackie
 */
public class PhysicalBook extends Book {
    
    /**
     * @param 
     */
    public PhysicalBook() {
        this(PhysicalCoverTypes.HARD);
    }

    /**
     * Constructor which creates a PhysicalMediaType with the given coverType
     * 
     * @param coverType
     */
    public PhysicalBook(String coverType) {
        this(new PhysicalMediaType(coverType));
    }

    /**
     * @param mediaType
     */
    protected PhysicalBook(IMediaType mediaType) {
        super(mediaType);
    }
   
}
