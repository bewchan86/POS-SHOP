package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuanLyTraHang extends JPanel {
	private JTextField txtTienKhachDua;
	private JTable tblGioHang;
	private JTextField txtSoLuong;
	private JTable tblDSSanPham;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable tblHoaDonTra;
	private JTextField textField_2;
	public JButton btnBanHang = new JButton("Bán Hàng");
	/**
	 * Create the panel.
	 */
	public QuanLyTraHang() {
		setPreferredSize(new Dimension(934, 685));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(new Color(255, 255, 255));
		
		JPanel pnlHoaDon = new JPanel();
		pnlHoaDon.setBackground(new Color(255, 255, 255));
		pnlHoaDon.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\u0110\u01A1n H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), null));
		
		JPanel pnlHoaDonCho = new JPanel();
		pnlHoaDonCho.setBorder(new CompoundBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "H\u00F3a \u0110\u01A1n Tr\u1EA3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), null), null));
		
		JPanel pnlCamera = new JPanel();
		pnlCamera.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JPanel pnlGioHang = new JPanel();
		pnlGioHang.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "S\u1EA3n Ph\u1EA9m C\u1EA7n \u0110\u1ED5i Tr\u1EA3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), null));
		
		JPanel pnlDanhSachSanPham = new JPanel();
		pnlDanhSachSanPham.setBorder(new CompoundBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Danh S\u00E1ch S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), null), null));


		btnBanHang.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/banhang.png")));
		btnBanHang.setForeground(new Color(255, 255, 255));
		btnBanHang.setBackground(new Color(50, 205, 50));
		btnBanHang.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel pnlGioHang_1 = new JPanel();
		pnlGioHang_1.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "S\u1EA3n Ph\u1EA9m M\u1EDBi", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Số Lượng      ");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton_2_1 = new JButton("OK");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_2_1.setBackground(new Color(144, 238, 144));
		
		JButton btnNewButton_3_1 = new JButton("Xóa sản phẩm");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_3_1.setBackground(new Color(210, 105, 30));
		GroupLayout gl_pnlGioHang_1 = new GroupLayout(pnlGioHang_1);
		gl_pnlGioHang_1.setHorizontalGroup(
			gl_pnlGioHang_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGioHang_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlGioHang_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
						.addGroup(gl_pnlGioHang_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_pnlGioHang_1.setVerticalGroup(
			gl_pnlGioHang_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGioHang_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlGioHang_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlGioHang_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JScrollPane scrollPane_GioHang_1 = new JScrollPane();
		panel_2.add(scrollPane_GioHang_1, "name_306977136963500");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "K\u00EDch th\u01B0\u1EDBc ", "\u0110\u01A1n Gi\u00E1", "S\u1ED1 L\u01B0\u1EE3ng"
			}
		));
		scrollPane_GioHang_1.setViewportView(table);
		pnlGioHang_1.setLayout(gl_pnlGioHang_1);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlGioHang, 0, 0, Short.MAX_VALUE)
						.addComponent(pnlDanhSachSanPham, 0, 0, Short.MAX_VALUE)
						.addComponent(pnlGioHang_1, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlHoaDonCho, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlCamera, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBanHang, Alignment.TRAILING)
						.addComponent(pnlHoaDon, GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(pnlCamera, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(pnlHoaDonCho, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlGioHang, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(pnlGioHang_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlDanhSachSanPham, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBanHang, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlHoaDon, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("Tìm kiêm sản phẩm : ");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Thêm Sản Phẩm");
		btnNewButton_4.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/add.png")));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_4.setBackground(new Color(65, 105, 225));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_pnlDanhSachSanPham = new GroupLayout(pnlDanhSachSanPham);
		gl_pnlDanhSachSanPham.setHorizontalGroup(
			gl_pnlDanhSachSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDanhSachSanPham.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(88))
				.addGroup(gl_pnlDanhSachSanPham.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_pnlDanhSachSanPham.setVerticalGroup(
			gl_pnlDanhSachSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDanhSachSanPham.createSequentialGroup()
					.addGroup(gl_pnlDanhSachSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4))
					.addGap(11)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
		);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1, "name_87070151630200");
		
		tblDSSanPham = new JTable();
		tblDSSanPham.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "lo\u1EA1i", "K\u00EDch th\u01B0\u1EDBc", "\u0110\u01A1n gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00E0u s\u1EAFc", "Ch\u1EA5t li\u1EC7u", "k\u00EDch th\u01B0\u1EDBc"
			}
		));
		tblDSSanPham.getColumnModel().getColumn(0).setPreferredWidth(93);
		tblDSSanPham.getColumnModel().getColumn(1).setPreferredWidth(94);
		tblDSSanPham.getColumnModel().getColumn(2).setPreferredWidth(40);
		scrollPane_1.setViewportView(tblDSSanPham);
		pnlDanhSachSanPham.setLayout(gl_pnlDanhSachSanPham);
		
		JPanel panel = new JPanel();
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Số Lượng      ");
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(144, 238, 144));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 9));
		
		JButton btnNewButton_3 = new JButton("Xóa sản phẩm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/xoa1sp.png")));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(210, 105, 30));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 10));
		panel.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane_GioHang = new JScrollPane();
		panel.add(scrollPane_GioHang, "name_86272947197200");
		
		tblGioHang = new JTable();
		tblGioHang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "K\u00EDch Th\u01B0\u1EDBc", "\u0110\u01A1n Gi\u00E1", "S\u1ED1 L\u01B0\u1EE3ng", "S\u1ED1 L\u01B0\u1EE3ng Tr\u1EA3"
			}
		));
		tblGioHang.getColumnModel().getColumn(1).setPreferredWidth(95);
		tblGioHang.getColumnModel().getColumn(2).setPreferredWidth(63);
		tblGioHang.getColumnModel().getColumn(3).setPreferredWidth(77);
		tblGioHang.getColumnModel().getColumn(4).setPreferredWidth(61);
		scrollPane_GioHang.setViewportView(tblGioHang);
		GroupLayout gl_pnlGioHang = new GroupLayout(pnlGioHang);
		gl_pnlGioHang.setHorizontalGroup(
			gl_pnlGioHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGioHang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlGioHang.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
						.addGroup(gl_pnlGioHang.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(60)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(155, Short.MAX_VALUE))))
		);
		gl_pnlGioHang.setVerticalGroup(
			gl_pnlGioHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGioHang.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnlGioHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlGioHang.createSequentialGroup()
							.addGap(13)
							.addComponent(lblNewLabel))
						.addGroup(gl_pnlGioHang.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlGioHang.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGap(10))
		);
		pnlGioHang.setLayout(gl_pnlGioHang);
		
		JPanel panel_3 = new JPanel();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNhapHoaDon = new JLabel("Nhập mã hóa đơn : ");
		GroupLayout gl_pnlHoaDonCho = new GroupLayout(pnlHoaDonCho);
		gl_pnlHoaDonCho.setHorizontalGroup(
			gl_pnlHoaDonCho.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
				.addGroup(gl_pnlHoaDonCho.createSequentialGroup()
					.addComponent(lblNhapHoaDon, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(147, Short.MAX_VALUE))
		);
		gl_pnlHoaDonCho.setVerticalGroup(
			gl_pnlHoaDonCho.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlHoaDonCho.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_pnlHoaDonCho.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNhapHoaDon))
					.addContainerGap())
		);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, "name_307270128994000");
		
		tblHoaDonTra = new JTable();
		tblHoaDonTra.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 H\u00F3a \u0110\u01A1n", "Ng\u00E0y t\u1EA1o ", "T\u00EAn nh\u00E2n vi\u00EAn", "T\u00EAn kh\u00E1ch h\u00E0ng"
			}
		));
		scrollPane.setViewportView(tblHoaDonTra);
		pnlHoaDonCho.setLayout(gl_pnlHoaDonCho);
		
		JPanel pnlKhachHang = new JPanel();
		pnlKhachHang.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblMaHD = new JLabel("Mã hóa đơn :");
		lblMaHD.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTngTin = new JLabel("Tổng tiền gốc : ");
		lblTngTin.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblGimGi = new JLabel("Giảm giá : ");
		lblGimGi.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblThuVat = new JLabel("Thuế VAT : ");
		lblThuVat.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblT = new JLabel("MUA HÀNG MỚI");
		lblT.setForeground(new Color(34, 139, 34));
		lblT.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTinKhcha = new JLabel("Tiền khách đưa : ");
		lblTinKhcha.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtTienKhachDua = new JTextField();
		txtTienKhachDua.setColumns(10);
		
		JLabel lblMaHDpush = new JLabel("0");
		
		JLabel lblTongTienpush = new JLabel("0");
		
		JLabel lblVAT = new JLabel("0");
		
		JLabel lblTongTienTra = new JLabel("0");
		
		JLabel lblTien = new JLabel("VNĐ");
		lblTien.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTien_1 = new JLabel("VNĐ");
		lblTien_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTien_2 = new JLabel("VNĐ");
		lblTien_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlGhiChu = new JPanel();
		pnlGhiChu.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnHuyHoaDon = new JButton("Hủy Hóa Đơn");
		btnHuyHoaDon.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/stop2.png")));
		btnHuyHoaDon.setForeground(new Color(255, 255, 255));
		btnHuyHoaDon.setBackground(new Color(255, 0, 0));
		btnHuyHoaDon.setFont(new Font("Arial", Font.BOLD, 12));
		btnHuyHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton = new JButton("Thanh Toán");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/thanhtoan.png")));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 22));
		
		JButton btnHuyHoaDon_1 = new JButton("Làm mới ");
		btnHuyHoaDon_1.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/refesh.png")));
		btnHuyHoaDon_1.setBackground(new Color(152, 251, 152));
		btnHuyHoaDon_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblY = new JLabel("Tiền trả : ");
		lblY.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTientra = new JLabel("0");
		
		JLabel lblTien_6 = new JLabel("VNĐ");
		lblTien_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblGiamGiapush_1 = new JLabel("0");
		
		JLabel lblTien_1_1 = new JLabel("VNĐ");
		lblTien_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTngTinTr = new JLabel("Tổng tiền trả : ");
		lblTngTinTr.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTng = new JLabel("Tổng tiền hàng : ");
		lblTng.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTongTienHang = new JLabel("0");
		
		JLabel lblTien_2_1 = new JLabel("VNĐ");
		lblTien_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblGimGi_1 = new JLabel("Giảm giá : ");
		lblGimGi_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblGiamGiaHoaDonMoi = new JLabel("0");
		
		JLabel lblTien_2_1_1 = new JLabel("VNĐ");
		lblTien_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblThuVat_1 = new JLabel("Thuế VAT : ");
		lblThuVat_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblThueVATmoi = new JLabel("0");
		
		JLabel lblTien_2_1_1_1 = new JLabel("VNĐ");
		lblTien_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTngTinMua = new JLabel("Tổng tiền mua : ");
		lblTngTinMua.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTien_2_1_1_1_1 = new JLabel("VNĐ");
		lblTien_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTongTienMoi = new JLabel("0");
		
		JLabel lblTien_2_1_1_1_2 = new JLabel("VNĐ");
		lblTien_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTinKhcha_1_1_1 = new JLabel("Ghi Chú : ");
		lblTinKhcha_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTinKhcha_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTinThaTr = new JLabel("Tiền thừa trả khách : ");
		lblTinThaTr.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTienTraKhach = new JLabel("0");
		
		JLabel lblTien_2_1_1_1_1_1 = new JLabel("VNĐ");
		lblTien_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pnlHoaDon = new GroupLayout(pnlHoaDon);
		gl_pnlHoaDon.setHorizontalGroup(
			gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlHoaDon.createSequentialGroup()
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlHoaDon.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
								.addComponent(pnlKhachHang, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlHoaDon.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlHoaDon.createSequentialGroup()
											.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblMaHD, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
												.addComponent(lblTngTin)
												.addComponent(lblGimGi, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblThuVat, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTngTinTr, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblY, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
												.addComponent(lblT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblTng, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGimGi_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblThuVat_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTngTinMua, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTinKhcha))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlHoaDon.createSequentialGroup()
													.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_pnlHoaDon.createSequentialGroup()
															.addGap(10)
															.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_pnlHoaDon.createSequentialGroup()
																	.addComponent(lblGiamGiaHoaDonMoi, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(lblTien_2_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
																	.addGroup(gl_pnlHoaDon.createSequentialGroup()
																		.addComponent(lblTongTienHang, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(lblTien_2_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																	.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_pnlHoaDon.createSequentialGroup()
																			.addComponent(lblGiamGiapush_1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(lblTien_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_pnlHoaDon.createSequentialGroup()
																			.addComponent(lblVAT, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(lblTien_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_pnlHoaDon.createSequentialGroup()
																			.addComponent(lblMaHDpush, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
																			.addGap(142))
																		.addGroup(gl_pnlHoaDon.createSequentialGroup()
																			.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.TRAILING)
																				.addGroup(gl_pnlHoaDon.createSequentialGroup()
																					.addComponent(lblTientra, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
																					.addComponent(lblTien_6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																				.addGroup(gl_pnlHoaDon.createSequentialGroup()
																					.addComponent(lblTongTienpush, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
																					.addComponent(lblTien, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
																			.addPreferredGap(ComponentPlacement.RELATED))
																		.addGroup(gl_pnlHoaDon.createSequentialGroup()
																			.addComponent(lblTongTienTra, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(lblTien_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))))
														.addGroup(gl_pnlHoaDon.createSequentialGroup()
															.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.TRAILING)
																.addGroup(gl_pnlHoaDon.createSequentialGroup()
																	.addComponent(txtTienKhachDua, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
																	.addGap(30))
																.addGroup(gl_pnlHoaDon.createSequentialGroup()
																	.addComponent(lblThueVATmoi, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)))
															.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
																.addComponent(lblTien_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblTien_2_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblTien_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblTien_2_1_1_1_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
													.addGap(19))
												.addGroup(gl_pnlHoaDon.createSequentialGroup()
													.addGap(10)
													.addComponent(lblTongTienMoi, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_pnlHoaDon.createSequentialGroup()
											.addComponent(lblTinThaTr)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblTienTraKhach, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_pnlHoaDon.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_pnlHoaDon.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnHuyHoaDon, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnHuyHoaDon_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblTinKhcha_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(pnlGhiChu, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))
							.addGap(3)))
					.addContainerGap())
		);
		gl_pnlHoaDon.setVerticalGroup(
			gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlHoaDon.createSequentialGroup()
					.addComponent(pnlKhachHang, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaHD)
						.addComponent(lblMaHDpush))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTngTin)
						.addComponent(lblTongTienpush)
						.addComponent(lblTien))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblY, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTientra)
						.addComponent(lblTien_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGimGi)
						.addComponent(lblGiamGiapush_1)
						.addComponent(lblTien_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVAT)
						.addComponent(lblTien_1)
						.addComponent(lblThuVat))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTien_2)
						.addComponent(lblTongTienTra)
						.addComponent(lblTngTinTr, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblT)
					.addGap(13)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTng, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTongTienHang)
						.addComponent(lblTien_2_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGimGi_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiamGiaHoaDonMoi)
						.addComponent(lblTien_2_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblThuVat_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblThueVATmoi)
						.addComponent(lblTien_2_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTngTinMua, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTongTienMoi)
						.addComponent(lblTien_2_1_1_1_2))
					.addGap(4)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTinKhcha)
						.addComponent(txtTienKhachDua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTien_2_1_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTinThaTr, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTienTraKhach)
						.addComponent(lblTien_2_1_1_1_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTinKhcha_1_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(pnlGhiChu, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlHoaDon.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHuyHoaDon_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHuyHoaDon, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		GroupLayout gl_pnlGhiChu = new GroupLayout(pnlGhiChu);
		gl_pnlGhiChu.setHorizontalGroup(
			gl_pnlGhiChu.createParallelGroup(Alignment.LEADING)
				.addGap(0, 279, Short.MAX_VALUE)
		);
		gl_pnlGhiChu.setVerticalGroup(
			gl_pnlGhiChu.createParallelGroup(Alignment.LEADING)
				.addGap(0, 91, Short.MAX_VALUE)
		);
		pnlGhiChu.setLayout(gl_pnlGhiChu);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng : ");
		lblMaKH.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblTenKH = new JLabel("Tên khách hàng : ");
		lblTenKH.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblKh = new JLabel("KH001");
		lblKh.setForeground(new Color(255, 0, 0));
		
		JLabel lblTrn = new JLabel("Trần Văn Bình");
		lblTrn.setForeground(Color.RED);
		
		JButton btnNewButton_1 = new JButton("Tìm");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setIcon(new ImageIcon(QuanLyTraHang.class.getResource("/icon/search.png")));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		GroupLayout gl_pnlKhachHang = new GroupLayout(pnlKhachHang);
		gl_pnlKhachHang.setHorizontalGroup(
			gl_pnlKhachHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKhachHang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlKhachHang.createSequentialGroup()
							.addComponent(lblTenKH, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTrn, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlKhachHang.createSequentialGroup()
							.addComponent(lblMaKH)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblKh, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(50)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pnlKhachHang.setVerticalGroup(
			gl_pnlKhachHang.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlKhachHang.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaKH)
						.addComponent(lblKh)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTenKH)
						.addComponent(lblTrn))
					.addContainerGap())
		);
		pnlKhachHang.setLayout(gl_pnlKhachHang);
		pnlHoaDon.setLayout(gl_pnlHoaDon);
		setLayout(groupLayout);

	}
}
