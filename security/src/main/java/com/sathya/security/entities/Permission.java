package com.sathya.security.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="permission_security")
public class Permission {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "permission_Id")
	private Integer permissionId;
	
	@Column(name= "permission_name")
	private String permissionName;
	
	@Column(name= "permission_description")
	private String permissionDescription;
	
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	
	public Integer getPermissionId() {
		return permissionId;
	}

	
//	@Transient
//	private int roleId;
//	@ManyToOne
//	@JoinColumn(name="role_id")
//	private Role role;
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
//	public int getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}
	
	
	
}
