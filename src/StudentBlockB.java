public class StudentBlockB extends Candidates{
    public static final String maths = "Maths";
    public static final String chemical = "Chemical";
    public static final String biological = "Biological";

    public StudentBlockB(int identificationNumber, String name, String address, String prioritize) {
        super(identificationNumber, name, address, prioritize);
    }
    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getIdentificationNumber() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPrioritize() + ", Subject: " + maths + " - " + chemical + " - " + biological +
                '}';
    }
}
