public class CanBoHanhChinh extends NguoiLaoDong {
    private double luongKhoan;

    public CanBoHanhChinh(String hoTen, String soBHXH, int namSinh, double luongKhoan) {
        super(hoTen, soBHXH, namSinh);
        this.luongKhoan = luongKhoan;
    }

    public double getLuongKhoan() {
        return luongKhoan;
    }

    public void setLuongKhoan(double luongKhoan) {
        this.luongKhoan = luongKhoan;
    }

    public void displayStat() {
        System.out.println("CanBoHanhChinh{" +
                "luongKhoan=" + luongKhoan +
                '}');
    }

    @Override
    public double tinhLuong() {
        return luongKhoan;
    }
}
