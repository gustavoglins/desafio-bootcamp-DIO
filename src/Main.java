import br.com.gustavo.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(6);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer!");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Gustavo");

        dev.inscreverBootcamp(bootcamp);

        System.out.println(dev.getNome());
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());

        dev.progredir();
        dev.progredir();
        dev.progredir();

        System.out.println("-");

        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());

        System.out.println("XP: " + dev.calcularToalXp());

        System.out.println("\n| ---------------------- |\n");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");

        dev2.inscreverBootcamp(bootcamp);

        System.out.println(dev2.getNome());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());

        dev2.progredir();

        System.out.println("-");

        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());

        System.out.println("XP: " + dev2.calcularToalXp());
    }
}