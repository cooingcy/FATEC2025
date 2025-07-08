public class Cadastro {
    static Aluno aluno1 = new Aluno();
    static Aluno aluno2 = new Aluno();
   
   public static void main (String args []){
       aluno1.setNome("Alex");
       aluno1.setNota((float) 10.0);
       aluno2.setNome("Matheus");
       aluno2.setNota((float) 7.0);
       
       
       System.out.println(aluno1.getNome() +" : " + aluno1.getNota()
       + "\n" +aluno2.getNome() +" : " + aluno2.getNota() 
       );
   }
}
