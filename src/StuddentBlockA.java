public class StuddentBlockA extends Candidates{
    public static final String maths = "Maths";
    public static final String physical = "Physical";
    public static final String chemical = "Chemical";

    public StuddentBlockA(int identificationNumber, String name, String address, String prioritize) {
        super(identificationNumber, name, address, prioritize);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getIdentificationNumber() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPrioritize() + ", Subject: " + maths + " - " + physical + " - " + chemical +
                '}';
    }

}
