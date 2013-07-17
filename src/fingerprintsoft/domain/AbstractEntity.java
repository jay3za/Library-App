package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IEntity;

/**
 * @author jackie
 */
public abstract class AbstractEntity implements IEntity {

    private Long id; // primary key for all domain objects / entities

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
