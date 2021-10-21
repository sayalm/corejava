package com.corejava.Regularexpression.Task;

public class Developer {
    String developerName;
    String email;
    String contact;

    public String getDeveloperName() {
        return developerName;
    }

    public Developer(String developerName, String email, String contact) {
        this.developerName = developerName;
        this.email = email;
        this.contact = contact;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        contact = contact;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerName='" + developerName + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                '}';
    }
}


