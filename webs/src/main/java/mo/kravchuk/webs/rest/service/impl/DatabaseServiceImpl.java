package mo.kravchuk.webs.rest.service.impl;

import mo.kravchuk.gui.database.Database;
import mo.kravchuk.gui.database.DatabaseReader;
import mo.kravchuk.webs.rest.service.DatabaseService;
import mo.kravchuk.webs.rest.exceptions.ApiException;
import mo.kravchuk.webs.rest.exceptions.ErrorCode;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServiceImpl implements DatabaseService {
    @Override
    public Database getDatabase() {
        var database = DatabaseReader.getDatabase();
        if (database == null) {
            throw new ApiException(ErrorCode.NO_ACTIVE_DATABASE);
        }
        return database;
    }
}
