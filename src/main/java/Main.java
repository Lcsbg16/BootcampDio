import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descriçao");
        curso1.setCargaHoraria(8);
//      System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("----");
        System.out.println("Conteudos concluidos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("XP Lucas:" + devLucas.calcularTotalXP());

        System.out.println("-----------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("----");
        System.out.println("Conteudos concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("XP Camila:" + devCamila.calcularTotalXP());
    }
}
