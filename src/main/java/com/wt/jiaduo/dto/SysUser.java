package com.wt.jiaduo.dto;
// Generated 2018-3-31 15:55:00 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysUser generated by hbm2java
 */
@Entity
@Table(name = "sys_user", catalog = "jiaduo")
public class SysUser implements java.io.Serializable {

	private Integer id;
	private String username;
	private String name;
	private String password;
	private Character locked;

	public SysUser() {
	}

	public SysUser(String username, String name, String password) {
		this.username = username;
		this.name = name;
		this.password = password;
	}

	public SysUser(String username, String name, String password, Character locked) {
		this.username = username;
		this.name = name;
		this.password = password;
		this.locked = locked;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 32)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "locked", length = 1)
	public Character getLocked() {
		return this.locked;
	}

	public void setLocked(Character locked) {
		this.locked = locked;
	}

}
