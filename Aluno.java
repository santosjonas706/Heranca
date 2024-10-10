package br.com.heranca;

/**
 *
 * @author jonas.3969
 */
public class Aluno extends Pessoa{
    private long matricula;
    private int[] notas;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }   
}
