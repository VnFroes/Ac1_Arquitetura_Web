package com.example.ac1;


import com.example.ac1.model.Curso;
import com.example.ac1.model.Professor;
import com.example.ac1.model.Agenda;
import com.example.ac1.repository.AgendaRepository;
import com.example.ac1.repository.CursoRepository;
import com.example.ac1.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Ac1Application {
	@Bean
	public CommandLineRunner init(
		@Autowired CursoRepository cursoRepository,
		@Autowired ProfessorRepository professorRepository,
		@Autowired AgendaRepository agendaRepository
	){ 

		return args -> {
			//inserir
			Curso c = new Curso((long) 0, "Fisioterapia inicial", 0, "Começo da fisioterapia", "Fisico", null);
			cursoRepository.inserir(c);


			//editar
			c.setDescricao("descricao");
			cursoRepository.editar(c);
			c = cursoRepository.obterPorId(1);
			System.out.println(c.getDescricao());
	};
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Ac1Application.class, args);
	}

}
