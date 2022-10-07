package com.lab1.entity;

import com.lab1.message.Messenger;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private User administrator;
    private Messenger adminMessenger;

    private List<User> members;
    private List<Task> tasks;
    private Messenger memberMessenger;

    public Project(User administrator, Messenger adminMessenger, Messenger memberMessenger) {
        this.administrator = administrator;
        this.adminMessenger = adminMessenger;
        this.memberMessenger = memberMessenger;
        this.members = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addMember(User member) {
        if (!members.contains(member)) {
            members.add(member);
            adminMessenger.notify(administrator, "New team member added - " + member.getId());
        }
    }

    public void setAdminMessenger(Messenger adminMessenger) {
        this.adminMessenger = adminMessenger;
    }

    public void setMemberMessenger(Messenger memberMessenger) {
        this.memberMessenger = memberMessenger;
    }

    public List<User> getMembers() {
        return new ArrayList<>(members);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
