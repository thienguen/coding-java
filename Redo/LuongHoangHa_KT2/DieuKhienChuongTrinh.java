import java.util.*;

public class DieuKhienChuongTrinh {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NguoiLaoDong[] mang = new NguoiLaoDong[n];
        for (int i = 0; i < n; i++) {
            String hoTen  = sc.next();
            String soBHXH = sc.next();
            int namSinh   = sc.nextInt();
            int soTietDay = sc.nextInt();
            double donGia = sc.nextDouble();
            mang[i] = new GiangVienHopDong(hoTen, soBHXH, namSinh, soTietDay, donGia);
        }
        for (int i = 0; i < n; i++) {
            mang[i].displayStat();
            System.out.println(mang[i].tinhLuong());
        }
        sc.close();
    }

}
