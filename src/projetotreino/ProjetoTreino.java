/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetotreino;
import projetotreino.Empregado;
import projetotreino.IEmpregado;
import projetotreino.Pessoa;
/**
 *
 * @author stefa
 */
public class ProjetoTreino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado empregadoTeste = new Empregado();
        empregadoTeste.setNome("Stefany");
        empregadoTeste.setAnoAdmissao(2015);
        empregadoTeste.setTotalHoraTrabalhada(92);
        empregadoTeste.setValorHoraTrabalhada(21.50);
        
        System.out.println("Nome: " + empregadoTeste.ExibirNome());
        System.out.println("Anos trabalhados: "+ empregadoTeste.calcularAnosTrabalhados(2021));
        System.out.println("Salário: "+ empregadoTeste.calcularSalario());
    }

}
