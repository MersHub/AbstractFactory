package factory;

import factory.Developer;

public interface ProjectFactoryTeam {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createPM();
}
