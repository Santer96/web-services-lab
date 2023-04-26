package com.lab7.db;

public class MongoDbConnector implements Connector {

    private static Connector connectorInstance;

    private MongoDbConnector() {
        System.out.println(PostgreSqlConnector.class.getName() + " created.");
    }

    @Override
    public void doQuery(String statement) {
        System.out.println("Query executed in " + MongoDbConnector.class.getName() + " : " + statement);
    }

    public static Connector getConnectorInstance() {
        if (connectorInstance == null) {
            synchronized (PostgreSqlConnector.class) {
                if (connectorInstance == null) {
                    connectorInstance = new MongoDbConnector();
                }
            }
        }
        return connectorInstance;
    }
}
