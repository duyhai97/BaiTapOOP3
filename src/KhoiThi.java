public class KhoiThi {
    String m1;
    String m2;
    String m3;

    public KhoiThi(String m1, String m2, String m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return "Khối thi: {" +
                "m1='" + m1 + '\'' +
                ", m2='" + m2 + '\'' +
                ", m3='" + m3 + '\'' +
                '}';
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }
}
