package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IElectronicBook;
import fingerprintsoft.domain.interfaces.IMediaType;

/**
 * @author jackie
 */
public class ElectronicBook extends Book implements IElectronicBook{
    
    /**
     * @param mediaType
     */
    protected ElectronicBook(IMediaType mediaType){
        super(mediaType);
    }
    
    /**
     * creates new object of mediaType
     */
    public ElectronicBook() {
        this(new ElectronicMediaType());
     }

    /**
     * @see fingerprintsoft.domain.interfaces.IBook#insert(fingerprintsoft.domain.Book)
     */
    public void insert(Book name) {
    }

    
}
