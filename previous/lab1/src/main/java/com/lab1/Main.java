package com.lab1;

import com.lab1.entity.Project;
import com.lab1.entity.Task;
import com.lab1.entity.User;
import com.lab1.logger.ConsoleLogger;
import com.lab1.logger.Logger;
import com.lab1.message.MessengerNotificator;
import com.lab1.message.SmsNotificator;

public class Main {

    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        // Set up admin user and project
        User admin = new User(1L, "Admin", User.Role.BE);
        Project project = new Project(admin, new SmsNotificator(), new MessengerNotificator());

        // Set up users
        User opsUser = new User(2L, "Bob", User.Role.OPS);
        User qaUser = new User(3L, "Jay", User.Role.QA);
        User feUser = new User(4L, "Tom", User.Role.FE);

        // Set up tasks
        Task opsTask = new Task(1L, logger);
        opsTask.setDescription("Some OPS task description");
        Task qaTask = new Task(2L, logger);
        qaTask.setDescription("Some QA task description");
        Task feTask = new Task(3L, logger);
        feTask.setDescription("Some FE task description");

        // Add users to project and assign tasks
        project.addMember(opsUser);
        project.addMember(qaUser);
        project.addMember(feUser);
        project.assignTask(opsUser, opsTask);
        project.assignTask(qaUser, qaTask);
        project.assignTask(feUser, feTask);

//        OUTPUT:
//        2022-10-08 14:54:28.889: Task 1 description updated to Some OPS task description
//        2022-10-08 14:54:28.895: Task 2 description updated to Some QA task description
//        2022-10-08 14:54:28.895: Task 3 description updated to Some FE task description
//        SEND notification via SMS to user User{id=1, name='Admin', role=BE}:
//        New team member added - User{id=2, name='Bob', role=OPS}
//        SEND notification via SMS to user User{id=1, name='Admin', role=BE}:
//        New team member added - User{id=3, name='Jay', role=QA}
//        SEND notification via SMS to user User{id=1, name='Admin', role=BE}:
//        New team member added - User{id=4, name='Tom', role=FE}
//        SEND notification via messenger to user User{id=2, name='Bob', role=OPS}:
//        New task have been assigned to you : Task{id=1, description='Some OPS task description'}
//        SEND notification via messenger to user User{id=3, name='Jay', role=QA}:
//        New task have been assigned to you : Task{id=2, description='Some QA task description'}
//        SEND notification via messenger to user User{id=4, name='Tom', role=FE}:
//        New task have been assigned to you : Task{id=3, description='Some FE task description'}
    }
}
