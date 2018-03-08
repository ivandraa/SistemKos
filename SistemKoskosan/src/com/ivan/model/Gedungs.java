package com.ivan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "gedungs")
public class Gedungs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_gedung")
	private int id_gedung;
	@Column(name="nama_gedung")
	private String nama_gedung;
	@Column(name="alamat_gedung")
	private String alamat_gedung;
	@Column(name="id_gedung_detail")
	private int id_gedung_detail;

}
