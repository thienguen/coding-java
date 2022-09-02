public class GiangVienHopDong extends NguoiLaoDong{
    private int soTietDay;
    private double donGia;

    public GiangVienHopDong(String hoTen, String soBHXH, int namSinh, int soTietDay, double donGia) {
        super(hoTen, soBHXH, namSinh);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void displayStat() {
        System.out.println("GiangVienHopDong{" +
                "soTietDay=" + soTietDay +
                ", donGia=" + donGia +
                '}');
    }

    @Override
    public double tinhLuong() {
        return soTietDay * donGia;
    }

}
