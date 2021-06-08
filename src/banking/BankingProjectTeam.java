package banking;

import factory.Developer;
import factory.ProjectFactoryTeam;
import factory.ProjectManager;
import factory.Tester;

public class BankingProjectTeam implements ProjectFactoryTeam {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createPM() {
        return new BankingPM();
    }
}
