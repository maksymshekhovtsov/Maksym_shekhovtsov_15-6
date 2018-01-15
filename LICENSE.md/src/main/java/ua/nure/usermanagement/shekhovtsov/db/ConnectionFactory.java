package ua.nure.usermanagement.shekhovtsov.db;

import java.sql.Connection;

/**
 *     Interface that specifies connection factory to load jdbc driver and
 *      connect to database.
 */

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseException;
}
