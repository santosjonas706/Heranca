package br.com.heranca;

/**
 *
 * @author jonas.3969
 */
public class Pricipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
       // Funcionario f = new Funcionario();
        
        Aluno a = new Aluno();
        a.setNome("Joaquim");
        a.setIdade(18);
        a.setSexo("M");
        a.setEmail("jo@gmail.com");
        a.setMatricula(123456789);
        a.setNotas(new int []{10, 5, 5, 6});
        
        System.out.println(a.getNome());
        System.out.println(a.getEmail());
        for (int nota: a.getNotas()){
            System.out.println(nota);
        }
        
        System.out.println("------------------------------------------------------------------------------");
        
        Professor p = new Professor();
        p.setNome("Mario");
        p.setIdade(40);
        p.setSexo("M");
        p.setEmail("mario@gmail.com");
        p.setDisciplina("Matematica");
        p.setSalario((float) 5.000);
        
        System.out.println(p.getNome());
        System.out.println(p.getEmail());
        System.out.println(p.getDisciplina());
        System.out.println(p.getSalario());
      
        System.out.println("------------------------------------------------------------------------------");
        
        Diretor d = new Diretor();
        d.setNome("Marcos");
        d.setIdade(40);
        d.setSexo("M");
        d.setEmail("marcos@gmail.com");
        
         System.out.println(d.getNome());
        System.out.println(d.getEmail());
    }
    
}
