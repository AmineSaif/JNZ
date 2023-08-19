package com.JNZ.project.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomUser", types = { UserEntity.class })
public interface UserProjection {
	public String getNomUser();
}
