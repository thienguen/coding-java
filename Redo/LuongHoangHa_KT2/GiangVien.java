class GiangVien extends GiangVienHopDong {
    private double heSoLuong;
    private double luongCoBan;

    public GiangVien(String hoTen, String soBHXH, int namSinh, int soTietDay, double donGia, double heSoLuong,
            double luongCoBan) {
        super(hoTen, soBHXH, namSinh, soTietDay, donGia);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void displayStat() {
        System.out.println("GiangVien {" +
                "heSoLuong=" + heSoLuong +
                ", luongCoBan=" + luongCoBan +
                '}');
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * luongCoBan + super.tinhLuong();
    }

}