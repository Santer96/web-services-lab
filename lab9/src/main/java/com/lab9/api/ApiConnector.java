package com.lab9.api;

public interface ApiConnector {
    void setUrl(String url);
    void setApiKey(String key);
    void doRequest(String query);
    void closeConnection();
}
