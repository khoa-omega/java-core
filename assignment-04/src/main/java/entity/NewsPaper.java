package entity;

public class NewsPaper extends Document {
    private int ngayPhatHanh;

    public NewsPaper(int id, String nxb, int releaseNumber, int ngayPhatHanh) {
        super(id, nxb, releaseNumber);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", id=" + id +
                ", nxb='" + nxb + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
