/**  Licensed Materials
 **  (C) Copyright Silvermoon Business Systems BVBA, Belgium 
 **  (C) Copyright Silvermoon Trading 5 Pty Ltd, South Africa
 **  All Rights Reserved.
 **/

package fingerprintsoft.resource.interfaces;

import java.util.List;
//import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;

/**
 * @author jackie
 */
public interface IMediaTypeResources {
    List findMediaType();

    List findMediaType(String name);

    void insert(IMediaType mediaType);

    void update(IMediaType mediaType);

    IMediaType delete(Long id);

    IMediaType getAuthor(Long id);
}
