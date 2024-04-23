import java.util.Scanner;

public class Policy 
{

    // Attributes
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private int policyHolderHeightInches;
    private int policyHolderWeightPounds;

    // Constructors

    /*
     * Constructs a Policy object with default values.
     */
    public Policy() {
        // Default constructor with default values
        this.policyNumber = 0;
        this.providerName = "Default Provider";
        this.policyHolderFirstName = "John";
        this.policyHolderLastName = "Doe";
        this.policyHolderAge = 30;
        this.policyHolderSmokingStatus = "non-smoker";
        this.policyHolderHeightInches = 68;
        this.policyHolderWeightPounds = 150;
    }

    /*
     * Constructs a Policy object with specified values.
     *
     * @param policyNumber             The policy number.
     * @param providerName             The name of the insurance provider.
     * @param policyHolderFirstName    The first name of the policyholder.
     * @param policyHolderLastName     The last name of the policyholder.
     * @param policyHolderAge          The age of the policyholder.
     * @param policyHolderSmokingStatus    The smoking status of the policyholder.
     * @param policyHolderHeightInches The height of the policyholder in inches.
     * @param policyHolderWeightPounds The weight of the policyholder in pounds.
     */
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
                  int policyHolderAge, String policyHolderSmokingStatus, int policyHolderHeightInches,
                  int policyHolderWeightPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        this.policyHolderHeightInches = policyHolderHeightInches;
        this.policyHolderWeightPounds = policyHolderWeightPounds;
    }

    // Getter and Setter methods (omitted for brevity)

    // Other methods

    /*
     * Calculates the BMI (Body Mass Index) of the policyholder.
     *
     * @return The BMI of the policyholder.
     */
    public double calculateBMI() {
        double heightInchesSquared = Math.pow(policyHolderHeightInches, 2);
        return (policyHolderWeightPounds * 703) / heightInchesSquared;
    }

    /*
     * Calculates the price of the insurance policy.
     *
     * @return The price of the insurance policy.
     */
    public double calculatePolicyPrice() {
        double baseFee = 600;
        double additionalFee = 0;

        if (policyHolderAge > 50) {
            additionalFee += 75;
        }
        if ("smoker".equalsIgnoreCase(policyHolderSmokingStatus)) {
            additionalFee += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }

    /*
     * Returns a string representation of the Policy object.
     *
     * @return A string representation of the Policy object.
     */
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", providerName='" + providerName + '\'' +
                ", policyHolderFirstName='" + policyHolderFirstName + '\'' +
                ", policyHolderLastName='" + policyHolderLastName + '\'' +
                ", policyHolderAge=" + policyHolderAge +
                ", policyHolderSmokingStatus='" + policyHolderSmokingStatus + '\'' +
                ", policyHolderHeightInches=" + policyHolderHeightInches +
                ", policyHolderWeightPounds=" + policyHolderWeightPounds +
                '}';
    }
}
