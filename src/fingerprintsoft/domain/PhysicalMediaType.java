package fingerprintsoft.domain;

import fingerprintsoft.constants.MediaTypeConstants;
import fingerprintsoft.domain.interfaces.IPhysicalMediaType;

/**
 * @author jackie
 */
public class PhysicalMediaType extends MediaType implements IPhysicalMediaType {
    private String coverType;

    private PhysicalMediaType() {
        setType(MediaTypeConstants.PHYSICAL);
    }
    
    public PhysicalMediaType(String coverType) {
        this();
        setCoverType(coverType);
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
    
}
