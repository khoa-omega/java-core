package entity;

public abstract class Document {
    protected int id;
    protected String nxb;
    protected int releaseNumber;

    public Document(int id, String nxb, int releaseNumber) {
        this.id = id;
        this.nxb = nxb;
        this.releaseNumber = releaseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", nxb='" + nxb + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
