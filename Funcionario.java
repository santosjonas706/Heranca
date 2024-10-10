package br.com.heranca;

/**
 *
 * @author jonas.3969
 */
public abstract class Funcionario extends Pessoa {
 private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
