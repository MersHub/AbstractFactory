package web;

import factory.Developer;
import factory.ProjectFactoryTeam;
import factory.ProjectManager;
import factory.Tester;

public class WebFactoryTeam implements ProjectFactoryTeam {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester createTester() {
        return new WebTester();
    }

    @Override
    public ProjectManager createPM() {
        return new WebManager();
    }
}
