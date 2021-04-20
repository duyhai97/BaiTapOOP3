public class StudentBlockC extends Candidates{
    public static final String literature = "Literature";
    public static final String history = "History";
    public static final String geographic = "Geographic";

    public StudentBlockC(int identificationNumber, String name, String address, String prioritize) {
        super(identificationNumber, name, address, prioritize);
    }
    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getIdentificationNumber() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPrioritize() + ", Subject: " + literature + " - " + history + " - " + geographic +
                '}';
    }
}
