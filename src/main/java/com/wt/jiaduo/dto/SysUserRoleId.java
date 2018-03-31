package com.wt.jiaduo.dto;
// Generated 2018-3-31 9:23:34 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SysUserRoleId generated by hbm2java
 */
@Embeddable
public class SysUserRoleId implements java.io.Serializable {

	private int sysUserId;
	private int sysRoleId;

	public SysUserRoleId() {
	}

	public SysUserRoleId(int sysUserId, int sysRoleId) {
		this.sysUserId = sysUserId;
		this.sysRoleId = sysRoleId;
	}

	@Column(name = "sys_user_id", nullable = false)
	public int getSysUserId() {
		return this.sysUserId;
	}

	public void setSysUserId(int sysUserId) {
		this.sysUserId = sysUserId;
	}

	@Column(name = "sys_role_id", nullable = false)
	public int getSysRoleId() {
		return this.sysRoleId;
	}

	public void setSysRoleId(int sysRoleId) {
		this.sysRoleId = sysRoleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysUserRoleId))
			return false;
		SysUserRoleId castOther = (SysUserRoleId) other;

		return (this.getSysUserId() == castOther.getSysUserId()) && (this.getSysRoleId() == castOther.getSysRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSysUserId();
		result = 37 * result + this.getSysRoleId();
		return result;
	}

}
