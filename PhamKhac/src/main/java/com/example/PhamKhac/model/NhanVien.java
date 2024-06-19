package com.example.PhamKhac.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Length(min = 1,max=3)
    private String MaNV;
    @Length(min = 1,max=100)
    private String TenNv;
    @Length(min = 1,max=3)
    private String Phai;
    @Length(min=1,max=200)
    private String NoiSinh;

    @ManyToOne
    @JoinColumn(name = "MaPhong")
    private PhongBan MaPhong;

    private int Luong;


}
