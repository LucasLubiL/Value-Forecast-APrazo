package com.Lal_polinomio.lal_polinomio.dto;

public class Lal_PrevisaoRequest {
    private Integer lal_anoPrevisao;
    private Integer lal_grauPolinomio;
    private String lal_tipoPolinomio;
    private double lal_percentualPrevisao;

    public Lal_PrevisaoRequest() {}

    public Lal_PrevisaoRequest(Integer lal_anoPrevisao, Integer lal_grauPolinomio, String lal_tipoPolinomio, double lal_percentualPrevisao) {
        this.lal_anoPrevisao = lal_anoPrevisao;
        this.lal_grauPolinomio = lal_grauPolinomio;
        this.lal_tipoPolinomio = lal_tipoPolinomio;
        this.lal_percentualPrevisao = lal_percentualPrevisao;
    }

    public Integer getLal_anoPrevisao() {
        return lal_anoPrevisao;
    }

    public void setLal_anoPrevisao(Integer lal_anoPrevisao) {
        this.lal_anoPrevisao = lal_anoPrevisao;
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

    public double getLal_percentualPrevisao() {
        return lal_percentualPrevisao;
    }

    public void setLal_percentualPrevisao(double lal_percentualPrevisao) {
        this.lal_percentualPrevisao = lal_percentualPrevisao;
    }

}
