public abstract class NguoiLaoDong {
    private String hoTen;
    private String soBHXH;
    private int namSinh;

    public NguoiLaoDong(String hoTen, String soBHXH, int namSinh) {
        this.hoTen = hoTen;
        this.soBHXH = soBHXH;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoBHXH() {
        return soBHXH;
    }

    public void setSoBHXH(String soBHXH) {
        this.soBHXH = soBHXH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void displayStat() {
        System.out.println("NguoiLaoDong{" +
                "hoTen='" + hoTen + '\'' +
                ", soBHXH='" + soBHXH + '\'' +
                ", namSinh=" + namSinh +
                '}');
    }

    abstract double tinhLuong();
    
}