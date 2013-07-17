/**  Licensed Materials
 **  (C) Copyright Silvermoon Business Systems BVBA, Belgium 
 **  (C) Copyright Silvermoon Trading 5 Pty Ltd, South Africa
 **  All Rights Reserved.
 **/

package fingerprintsoft.domain.interfaces;

/**
 * @author jackie
 */
public interface IEntity {

    /**
     * Returns the id of the entity
     * @return id
     */
    Long getId();
    
    /**
     * Sets the ID of the Entity
     * @param id
     */
    void setId(Long id);

}
