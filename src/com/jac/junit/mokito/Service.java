package com.jac.junit.mokito;

/**
 *
 * @author hp
 */
public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvailable();
    }
    //master commit 1

    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    } 
}
