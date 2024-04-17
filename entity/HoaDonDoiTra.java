package entity;

import java.util.Date;

public class HoaDonDoiTra {
    private SanPham sanPham;
    private HoaDon hoaDon;
    private int soLuong;
    private Date ngayDoiTra;

    public HoaDonDoiTra() {
        // Constructor mặc nhiên
    }

    public HoaDonDoiTra(SanPham sanPham, HoaDon hoaDon, int soLuong, Date ngayDoiTra) {
        this.sanPham = sanPham;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.ngayDoiTra = ngayDoiTra;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong > 0) {
            this.soLuong = soLuong;
        } else {
            throw new IllegalArgumentException("Số lượng phải lớn hơn 0.");
        }
    }

    public Date getNgayDoiTra() {
        return ngayDoiTra;
    }

    public void setNgayDoiTra(Date ngayDoiTra) {
        // Kiểm tra ngày đổi trả phải lớn hơn hoặc bằng ngày lập hóa đơn
        if (ngayDoiTra.compareTo(hoaDon.getNgayLap()) >= 0) {
            this.ngayDoiTra = ngayDoiTra;
        } else {
            throw new IllegalArgumentException("Ngày đổi trả phải lớn hơn hoặc bằng ngày lập hóa đơn.");
        }
    }

    public double tienTra() {
        // Tính tiền trả dựa trên logic mô tả trong yêu cầu
        if (hoaDon != null) {
            double tongTienHoaDonCu = hoaDon.tongTien();
            double tongTienHoaDonMoi = sanPham.getGiaBan() * soLuong;
            if (tongTienHoaDonMoi <= tongTienHoaDonCu) {
                return tongTienHoaDonCu;
            }
        }
        return 0.0; // Mặc định trả 0 nếu không thỏa điều kiện trong yêu cầu
    }

    public double tongTien() {
        if (hoaDon != null) {
            double tongTienHoaDonCu = hoaDon.tongTien();
            double tongTienHoaDonMoi = sanPham.getGiaBan()* soLuong;
            if (tongTienHoaDonMoi > tongTienHoaDonCu) {
                return tongTienHoaDonMoi - tongTienHoaDonCu;
            }
        }
        return 0.0; // Mặc định trả 0 nếu không thỏa điều kiện trong yêu cầu
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonDoiTra{" +
                "sanPham=" + sanPham +
                ", hoaDon=" + hoaDon +
                ", soLuong=" + soLuong +
                ", ngayDoiTra=" + ngayDoiTra +
                '}';
    }
}
