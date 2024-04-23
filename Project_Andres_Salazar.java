import java.util.Scanner;

public class Project_Andres_Salazar
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter necessary information
        System.out.println("Enter policy number:");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter provider name:");
        String providerName = scanner.nextLine();
        System.out.println("Enter policyholder's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter policyholder's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter policyholder's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter policyholder's smoking status (smoker/non-smoker):");
        String smokingStatus = scanner.nextLine();
        System.out.println("Enter policyholder's height (in inches):");
        int height = scanner.nextInt();
        System.out.println("Enter policyholder's weight (in pounds):");
        int weight = scanner.nextInt();

        // Create instance of Policy class using constructor with arguments
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display information about the policy
        System.out.println("\nPolicy Information:");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policyholder's Height (in inches): " + policy.getPolicyHolderHeightInches());
        System.out.println("Policyholder's Weight (in pounds): " + policy.getPolicyHolderWeightPounds());
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());

        scanner.close();
    }
}
