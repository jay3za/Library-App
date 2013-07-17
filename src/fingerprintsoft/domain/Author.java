package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IAuthor;

public class Author extends AbstractEntity implements IAuthor {
	public static String Name;
	private String name;

	/**
	 * @return name
	 */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }		
}
