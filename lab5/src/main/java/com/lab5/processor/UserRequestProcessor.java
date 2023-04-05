package com.lab5.processor;

import com.lab5.entity.User;
import com.lab5.rest.RestRequest;

public class UserRequestProcessor extends RequestProcessor {

    @Override
    public Object parseRequest(RestRequest restRequest) {
        return restRequest.getObjectToUpdate();
    }

    @Override
    public boolean validateEntity(Object entity) {
        if (entity instanceof User) {
            User user = (User) entity;
            return !user.getName().isEmpty() || !user.getPassword().isEmpty();
        }
        return false;
    }

    @Override
    public void beforeUpdate(Object entity) {
        System.out.println("Remove email field from user entity...");
        User user = (User) entity;
        user.setEmail("");
    }

    @Override
    public boolean updateData(Object entity) {
        System.out.println("Updating user in DB...");
        return true;
    }

    @Override
    public String generateResponse(Object entity, boolean isValid, boolean isUpdated) {
        if (!isValid) {
            return "User fields are invalid!";
        }
        if (!isUpdated) {
            return "User update failed. Try again!";
        }
        return "User successfully updated";
    }
}
