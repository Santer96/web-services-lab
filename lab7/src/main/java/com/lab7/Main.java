package com.lab7;

import com.lab7.db.Connector;
import com.lab7.db.MongoDbConnector;
import com.lab7.db.PostgreSqlConnector;

public class Main {
    public static void main(String[] args) {
        Connector mongoConnector = MongoDbConnector.getConnectorInstance();
        mongoConnector.doQuery("Some mongo query");
        Connector mongoConnector2 = MongoDbConnector.getConnectorInstance();
        mongoConnector2.doQuery("Another mongo query");
//        com.lab7.db.PostgreSqlConnector created.
//        Query executed in com.lab7.db.MongoDbConnector : Some mongo query
//        Query executed in com.lab7.db.MongoDbConnector : Another mongo query

        Connector postgreConnector = PostgreSqlConnector.getConnectorInstance();
        postgreConnector.doQuery("Some postgre query");
        Connector postgreConnector2 = PostgreSqlConnector.getConnectorInstance();
        postgreConnector2.doQuery("Another postgre query");
        Connector postgreConnector3 = PostgreSqlConnector.getConnectorInstance();
        postgreConnector3.doQuery("One more postgre query");
//        com.lab7.db.PostgreSqlConnector created.
//        Query executed in com.lab7.db.MongoDbConnector : Some postgre query
//        Query executed in com.lab7.db.MongoDbConnector : Another postgre query
//        Query executed in com.lab7.db.MongoDbConnector : One more postgre query
    }
}
