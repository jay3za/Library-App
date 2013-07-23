package fingerprintsoft.resource.interfaces;

import java.util.List;
import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;

/**
 * @author jackie
 */
public interface IMediaTypeResources {

    /**
	 *
	 * @param name
	 * @return
	 */
	List findMediaType(String name);

    /**
	 *
	 * @param mediaType
	 */
	void insert(IMediaType mediaType);

    /**
	 *
	 * @param mediaType
	 */
	void update(IMediaType mediaType);

    /**
	 *
	 * @param mediaType
	 */
	public IMediaType delete();

    /**
	 *
	 * @param mediaType
	 */
	void getAuthor(IMediaType mediaType);

	//netbeans insert
	public void insert(String electronic);

	public void update(String electronic);

	//public void delete(String electronic);

	public static class coverType {

		public coverType() {
		}
	}
	
}
