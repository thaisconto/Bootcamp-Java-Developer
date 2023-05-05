package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap();
        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");
        System.out.println("Dados do aluno: " + aluno);
        System.out.println("------");
        System.out.println("Set's : " + aluno.keySet());
        System.out.println("Valores: " + aluno.values());
        System.out.println("------");
        List<Map<String, String>> listaAlunos = new ArrayList();
        listaAlunos.add(aluno);
        Map<String, String> aluno2 = new HashMap();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");
        listaAlunos.add(aluno2);
        System.out.println("Dados do aluno 2: " + aluno2);
        System.out.println("------");
        System.out.println("Lista de alunos: " + listaAlunos);
        System.out.println("------");
        System.out.println("Map contém set Nome? " + aluno.containsKey("Nome"));
    }
}
