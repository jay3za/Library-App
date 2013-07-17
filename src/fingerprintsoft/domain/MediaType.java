package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IMediaType;

public abstract class MediaType extends AbstractEntity implements IMediaType {

    private String type;
    
    /**
     * @return type
     */
    public String getType() {
        
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
   
}
