package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * A help stud class to represent Storage used in LogicTest file.
 */
public class StorageStub implements Storage {

    public StorageStub(String filePath) {
    }
    
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // TODO Auto-generated method stub
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return new AddressBook();
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

}
