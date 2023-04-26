package com.lab7.db;

public class PostgreSqlConnector implements Connector {

    private static Connector connectorInstance;

    private PostgreSqlConnector() {
        System.out.println(PostgreSqlConnector.class.getName() + " created.");
    }

    @Override
    public void doQuery(String statement) {
        System.out.println("Query executed in " + PostgreSqlConnector.class.getName() + " : " + statement);
    }

    public static Connector getConnectorInstance() {
        if (connectorInstance == null) {
            synchronized (PostgreSqlConnector.class) {
                if (connectorInstance == null) {
                    connectorInstance = new PostgreSqlConnector();
                }
            }
        }
        return connectorInstance;
    }
}
