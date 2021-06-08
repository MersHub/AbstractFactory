package web;

import factory.ProjectManager;

public class WebManager implements ProjectManager {
    @Override
    public void project() {
        System.out.println("Web manager project ......");
    }
}
