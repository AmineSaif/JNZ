package com.JNZ.project;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.JNZ.project.entities.UserEntity;

@SpringBootApplication
public class JnzApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(JnzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(UserEntity.class);
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

	
}
