package com.sbt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_user")

//@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class RoleOfUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rid;
	private String rname;
	

	@ManyToMany(mappedBy = "roles")
	private List<User> users;
}
