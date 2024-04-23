import java.util.Objects;

public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private int policyHolderHeightInches;
    private int policyHolderWeightPounds;

    /*
     * Default constructor with default values.
     */
    public Policy() {
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
     * Constructor with arguments.
     * @param policyNumber The policy number.
     * @param providerName The provider name.
     * @param policyHolderFirstName The policy holder's first name.
     * @param policyHolderLastName The policy holder's last name.
     * @param policyHolderAge The policy holder's age.
     * @param policyHolderSmokingStatus The policy holder's smoking status.
     * @param policyHolderHeightInches The policy holder's height in inches.
     * @param policyHolderWeightPounds The policy holder's weight in pounds.
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

    /*
     * Calculates the BMI (Body Mass Index) of the policy holder.
     * @return The BMI of the policy holder.
     */
    public double calculateBMI() {
        double heightInchesSquared = Math.pow(policyHolderHeightInches, 2);
        return (policyHolderWeightPounds * 703) / heightInchesSquared;
    }

    /*
     * Calculates the price of the insurance policy.
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

    // toString method
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