import br.com.gustavo.desafio.dominio.Curso;
import br.com.gustavo.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "descicao curso java", 8);
        Curso curso2 = new Curso("Curso Python", "descicao curso python", 6);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "descricao mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}