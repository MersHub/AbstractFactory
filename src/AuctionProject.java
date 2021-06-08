import banking.BankingProjectTeam;
import factory.Developer;
import factory.ProjectFactoryTeam;
import factory.ProjectManager;
import factory.Tester;
import web.WebFactoryTeam;

public class AuctionProject {
    public static void main(String[] args) {
        ProjectFactoryTeam projectFactoryTeam = new WebFactoryTeam();
        Developer developer = projectFactoryTeam.createDeveloper();
        Tester tester = projectFactoryTeam.createTester();
        ProjectManager projectManager = projectFactoryTeam.createPM();

        System.out.println(" Project Create ............");

        developer.writes();
        tester.tests();
        projectManager.project();

    }

}
