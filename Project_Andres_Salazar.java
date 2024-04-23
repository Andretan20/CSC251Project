import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Andres_Salazar {
    public static void main(String[] args) {
        // Create an ArrayList to store Policy objects
        ArrayList<Policy> policies = new ArrayList<>();

        // Read policy information from the text file
        try {
            File file = new File("PolicyInformation.txt");
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

                // Create a Policy object with the read information
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

                // Add the Policy object to the ArrayList
                policies.add(policy);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Display information about the policies
        System.out.println("Policy Information:");
        for (Policy policy : policies) {
            System.out.println(policy);
        }
    }
}