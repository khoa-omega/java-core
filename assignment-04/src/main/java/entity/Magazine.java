package entity;

public class Magazine extends Document {
    private String soPhatHanh;
    private int thangPhatHanh;

    public Magazine(int id, String nxb, int releaseNumber, String soPhatHanh, int thangPhatHanh) {
        super(id, nxb, releaseNumber);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                ", id=" + id +
                ", nxb='" + nxb + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
