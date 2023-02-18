package javaOracleWebix.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int maKhachHang;
	private String tenKhachHang;
	private String diaChi;
	private String mail;
	private String phone;
	private String image;
	private Date birthday;
	private String isUse;
	private int roleId;
//	public int getMaKhachHang() {
//		return maKhachHang;
//	}
//	public void setMaKhachHang(int maKhachHang) {
//		this.maKhachHang = maKhachHang;
//	}
//	public String getTenKhachHang() {
//		return tenKhachHang;
//	}
//	public void setTenKhachHang(String tenKhachHang) {
//		this.tenKhachHang = tenKhachHang;
//	}
//	public String getDiaChi() {
//		return diaChi;
//	}
//	public void setDiaChi(String diaChi) {
//		this.diaChi = diaChi;
//	}
//	public String getMail() {
//		return mail;
//	}
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//	public Date getBirthday() {
//		return birthday;
//	}
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}
//	public String getIsUse() {
//		return isUse;
//	}
//	public void setIsUse(String isUse) {
//		this.isUse = isUse;
//	}
//	public int getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//	
	
	
}
