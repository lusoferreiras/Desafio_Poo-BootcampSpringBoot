package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Luan: "+devLuan.getConteudosInscritos());
        devLuan.progredir();
        System.out.println("------------------------------------");
        System.out.println("Conteúdos Inscritos Luan: "+devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan: "+devLuan.getConteudosConcluidos());
        System.out.println("XP:"+devLuan.calcularTotalXp());
        devLuan.progredir();


        System.out.println("------------------------------------");
        Dev devDiana = new Dev();
        devDiana.setNome("Diana");
        devDiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diana: "+devDiana.getConteudosInscritos());
        devDiana.progredir();
        devDiana.progredir();
        devDiana.progredir();
        System.out.println("------------------------------------");
        System.out.println("Conteúdos Inscritos Diana: "+devDiana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Diana: "+devDiana.getConteudosConcluidos());
        System.out.println("XP:"+devDiana.calcularTotalXp());

    }
}