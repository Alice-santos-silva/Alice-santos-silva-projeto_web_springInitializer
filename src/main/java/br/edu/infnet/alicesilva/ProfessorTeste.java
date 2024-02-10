package br.edu.infnet.alicesilva;
import br.edu.infnet.alicesilva.model.domain.Professor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfessorTeste implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Professor p1 = new Professor();
		p1.setNome("Alice");
		p1.setRegistro(123);
		p1.setMestre(true);
		p1.setSalario(1000);
		System.out.println("Professor " + p1.getNome() + " foi cadastrado com sucesso");
		System.out.println("Professor recebe R$" + p1.calcularSalario() + "!");
		
		Professor p2 = new Professor();
		p2.setNome("Gabriel");
		p2.setRegistro(456);
		p2.setMestre(false);
		p2.setSalario(2000);
		System.out.println("Professor " + p2.getNome() + " foi cadastrado com sucesso");
		System.out.println("Professor recebe R$" + p2.calcularSalario() + "!");
		
		Professor p3 = new Professor();
		p3.setNome("Henrique");
		p3.setRegistro(789);
		p3.setSalario(3000);
		System.out.println("Professor " + p3.getNome() + " foi cadastrado com sucesso");
		System.out.println("Professor recebe R$" + p3.calcularSalario() + "!");

	}
}
