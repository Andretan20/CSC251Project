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

    // Policy Number
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    // Provider Name
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    // Policyholder's First Name
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public void setPolicyHolderFirstName(String policyHolderFirstName) {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    // Policyholder's Last Name
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public void setPolicyHolderLastName(String policyHolderLastName) {
        this.policyHolderLastName = policyHolderLastName;
    }

    // Policyholder's Age
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public void setPolicyHolderAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }

    // Policyholder's Smoking Status
    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    // Policyholder's Height (in inches)
    public int getPolicyHolderHeightInches() {
        return policyHolderHeightInches;
    }

    public void setPolicyHolderHeightInches(int policyHolderHeightInches) {
        this.policyHolderHeightInches = policyHolderHeightInches;
    }

    // Policyholder's Weight (in pounds)
    public int getPolicyHolderWeightPounds() {
        return policyHolderWeightPounds;
    }

    public void setPolicyHolderWeightPounds(int policyHolderWeightPounds) {
        this.policyHolderWeightPounds = policyHolderWeightPounds;
    }

    // Calculate BMI
    public double calculateBMI() {
        double heightInchesSquared = Math.pow(policyHolderHeightInches, 2);
        return (policyHolderWeightPounds * 703) / heightInchesSquared;
    }

    // Calculate Policy Price
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
