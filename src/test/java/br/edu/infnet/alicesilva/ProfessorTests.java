package br.edu.infnet.alicesilva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.alicesilva.model.domain.Professor;

@SpringBootTest
class ProfessorTests {

	private Professor professor;
	private final String NOME = "Alice";
	private final int REGISTRO = 123;
	
	@BeforeEach
	void setUp() {
		professor = new Professor();
		professor.setNome(NOME);
		professor.setRegistro(REGISTRO);
		professor.setMestre(false);
		professor.setSalario(0);
	}
	
	@Test
	void professorMestreMenor5000() {
		professor.setMestre(true);
		professor.setSalario(1000);
		assertEquals(2250, professor.calcularSalario()); 
	}
	
	@Test
	void professorMestreMaior5000() {
		professor.setMestre(true);
		professor.setSalario(6000);
		assertEquals(8250, professor.calcularSalario()); 
	}
	
	@Test
	void professorMestreIgual5000() {
		professor.setMestre(true);
		professor.setSalario(5000);
		assertEquals(7250, professor.calcularSalario()); 
	}
	
	@Test
	void professorNaoMestreMenor5000() {
		professor.setSalario(1000);
		assertEquals(1750, professor.calcularSalario()); 
	}
	
	@Test
	void professorNaoMestreMaior5000() {
		professor.setSalario(6000);
		assertEquals(6750, professor.calcularSalario()); 
	}
	
	@Test
	void professorNaoMestreIgual5000() {
		professor.setSalario(5000);
		assertEquals(5750, professor.calcularSalario()); 
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, professor.getNome());
		assertEquals(REGISTRO, professor.getRegistro());
		assertEquals(false, professor.isMestre());
		assertEquals(0, professor.getSalario());
	}
}

