package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.ICategory;

public class Category extends AbstractEntity implements ICategory{
	private String name;
	private String type;
	
	/**
	 * @return 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name=name;
	}
	/**
	 * @return type
	 */
	public String getType(){
		return type;
	}
	/**
	 * @param type
	 */
	public void setType(String type){
		this.type=type;
	}
}
