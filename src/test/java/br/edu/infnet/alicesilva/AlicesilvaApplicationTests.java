package br.edu.infnet.alicesilva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.alicesilva.model.domain.Professor;

@SpringBootTest
class AlicesilvaApplicationTests {

	@Test
	void professorMestre() {
		Professor p1 = new Professor();
		p1.setNome("Alice");
		p1.setRegistro(123);
		p1.setMestre(true);
		p1.setSalario(1000);
		assertEquals(2000, p1.calcularSalario());
	}
	
	@Test
	void professorNaoMestre() {
		Professor p2 = new Professor();
		p2.setNome("Gabriel");
		p2.setRegistro(456);
		p2.setMestre(false);
		p2.setSalario(2000);
		assertEquals(2500, p2.calcularSalario());
	}
	
	@Test
	void profSemIndicacao() {
		Professor p3 = new Professor();
		p3.setNome("Henrique");
		p3.setRegistro(789);
		p3.setSalario(3000);
		assertEquals(3500, p3.calcularSalario());
	}

}


