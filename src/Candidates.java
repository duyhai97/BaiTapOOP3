public class Candidates {
    private int IdentificationNumber;
    private String name;
    private String address;
    private String prioritize;
    private KhoiThi khoiThi;

    @Override
    public String toString() {
        return "Candidates{" +
                "IdentificationNumber=" + IdentificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritize='" + prioritize + '\'' +
                ", khoiThi=" + getKhoiThi(khoiThi) +
                '}';
    }


    public KhoiThi getKhoiThi(KhoiThi khoithi) {
        return khoiThi;
    }

    public void setKhoiThi(KhoiThi khoiThi) {
        this.khoiThi = khoiThi;
    }

    public Candidates(int identificationNumber, String name, String address, String prioritize) {
        IdentificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
    }

    public int getIdentificationNumber() {
        return IdentificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        IdentificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(String prioritize) {
        this.prioritize = prioritize;
    }
}
