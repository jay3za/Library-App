/**  Licensed Materials
 **  (C) Copyright Silvermoon Business Systems BVBA, Belgium 
 **  (C) Copyright Silvermoon Trading 5 Pty Ltd, South Africa
 **  All Rights Reserved.
 **/

package fingerprintsoft.resource.interfaces;

import java.util.List;
//import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;

/**
 * @author jackie
 */
public interface ICategoryResource {
    List findCategory();

    List findCategory(String name);

    void insert(ICategory category);

    void update(ICategory category);

    ICategory delete(Long id);

    ICategory getCategory(Long id);
}