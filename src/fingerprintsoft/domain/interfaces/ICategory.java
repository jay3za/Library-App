package fingerprintsoft.domain.interfaces;

import fingerprintsoft.domain.Category;
/**
 * @author Jackie
 */
public interface ICategory extends IEntity {

    /**
     * Returns the Category Name of the book eg: Java, PostgreSQL, Javascript
     * @return name
     */
    String getName();

    /**
     * Sets the Category Name of the book
     * @param name
     */
    void setName(String name);

    /**
     * Returns the Category Type of the book
     * @return type
     */
    String getType();
    
    /**
     * Sets the Category Type of the book eg: Programming, Design, Database, Scripting
     * @param type
     */
    void setType(String type);

}
