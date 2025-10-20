package com.Lal_polinomio.lal_polinomio.dto;

import java.math.BigDecimal;

public class Lal_PrevisaoResponse {
    private Integer lal_ano;
    private double lal_valorPrevisto;
    private Integer lal_grauPolinomio;
    private String lal_tipoPolinomio;
    private String lal_formula;
    private String lal_mensagem;
    private double lal_percentualPrevisao;

    public Lal_PrevisaoResponse() {}

    public Lal_PrevisaoResponse(Integer lal_ano, double lal_valorPrevisto, Integer lal_grauPolinomio, String lal_tipoPolinomio, double lal_percentualPrevisao) {
        this.lal_ano = lal_ano;
        this.lal_valorPrevisto = lal_valorPrevisto;
        this.lal_grauPolinomio = lal_grauPolinomio;
        this.lal_tipoPolinomio = lal_tipoPolinomio;
        this.lal_percentualPrevisao = lal_percentualPrevisao;

    }

    public Integer getLal_ano() {
        return lal_ano;
    }

    public void setLal_ano(Integer lal_ano) {
        this.lal_ano = lal_ano;
    }

    public double getLal_valorPrevisto() {
        return lal_valorPrevisto;
    }

    public void setLal_valorPrevisto(double lal_valorPrevisto) {
        this.lal_valorPrevisto = lal_valorPrevisto;
    }

    public Integer getLal_grauPolinomio() {
        return lal_grauPolinomio;
    }

    public void setLal_grauPolinomio(Integer lal_grauPolinomio) {
        this.lal_grauPolinomio = lal_grauPolinomio;
    }

    public String getLal_tipoPolinomio() {
        return lal_tipoPolinomio;
    }

    public void setLal_tipoPolinomio(String lal_tipoPolinomio) {
        this.lal_tipoPolinomio = lal_tipoPolinomio;
    }

    public String getLal_formula() {
        return lal_formula;
    }

    public void setLal_formula(String lal_formula) {
        this.lal_formula = lal_formula;
    }

    public String getLal_mensagem() {
        return lal_mensagem;
    }

    public void setLal_mensagem(String lal_mensagem) {
        this.lal_mensagem = lal_mensagem;
    }

    public double getLal_percentualPrevisao() {
        return lal_percentualPrevisao;
    }

    public void setLal_percentualPrevisao(double lal_percentualPrevisao) {
        this.lal_percentualPrevisao = lal_percentualPrevisao;
    }

}
