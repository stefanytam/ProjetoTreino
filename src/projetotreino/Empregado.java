/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetotreino;

/**
 *
 * @author stefa
 */
public class Empregado extends Pessoa implements IEmpregado {

    private int anoAdmissao;
    private double valorHoraTrabalhada;
    private int totalHoraTrabalhada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public int getTotalHoraTrabalhada() {
        return totalHoraTrabalhada;
    }

    public void setTotalHoraTrabalhada(int totalHoraTrabalhada) {
        this.totalHoraTrabalhada = totalHoraTrabalhada;
    }

    @Override
    public String ExibirNome() {
        return nome;
    }

    @Override
    public double calcularSalario() {
        return valorHoraTrabalhada * totalHoraTrabalhada;
    }

    @Override
    public int calcularAnosTrabalhados(int anoAtual) {
        return anoAtual - anoAdmissao;
    }
    
}
