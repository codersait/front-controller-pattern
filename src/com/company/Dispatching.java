package com.company;

public class Dispatching {
    private Viewer studentView;
    private Viewer teacherView;

    public Dispatching() {
        studentView = new StudentView();
        teacherView = new TeacherView();
    }

    public void dispatch(Request request) {
        if (request.getRequest().equalsIgnoreCase("Student")) {
            studentView.display();
        } else if (request.getRequest().equalsIgnoreCase("Teacher")) {
            teacherView.display();
        } else {
            System.out.println("No View");
        }
    }
}
