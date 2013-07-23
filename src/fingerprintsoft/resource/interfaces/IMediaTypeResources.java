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
	void delete(IMediaType mediaType);

    /**
	 *
	 * @param mediaType
	 */
	void getAuthor(IMediaType mediaType);

	public void insert(String electronic);
	
}
