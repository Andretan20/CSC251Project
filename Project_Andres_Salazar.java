import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Andres_Salazar {
    public static void main(String[] args) {
        ArrayList<Policy> policies = readPoliciesFromFile("PolicyInformation.txt");

        if (policies != null) {
            displayPolicyInformation(policies);
            displaySmokersAndNonSmokers(policies);
        }
    }

    private static ArrayList<Policy> readPoliciesFromFile(String filename) {
        ArrayList<Policy> policies = new ArrayList<>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int policyNumber = Integer.parseInt(scanner.nextLine());
                String providerName = scanner.nextLine();
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String smokingStatus = scanner.nextLine();
                int height = Integer.parseInt(scanner.nextLine());
                int weight = Integer.parseInt(scanner.nextLine());

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return null;
        }

        return policies;
    }

    private static void displayPolicyInformation(ArrayList<Policy> policies) {
        System.out.println("Policy Information:");
        for (Policy policy : policies) {
            System.out.println(policy);
        }
    }

    private static void displaySmokersAndNonSmokers(ArrayList<Policy> policies) {
        int smokers = 0;
        int nonSmokers = 0;

        for (Policy policy : policies) {
            if ("smoker".equalsIgnoreCase(policy.getPolicyHolderSmokingStatus())) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }

        System.out.println("Number of Smokers: " + smokers);
        System.out.println("Number of Non-Smokers: " + nonSmokers);
    }
}