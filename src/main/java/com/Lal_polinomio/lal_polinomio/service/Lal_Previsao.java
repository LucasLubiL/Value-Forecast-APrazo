package com.Lal_polinomio.lal_polinomio.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.Lal_polinomio.lal_polinomio.dto.Lal_PrevisaoRequest;
import com.Lal_polinomio.lal_polinomio.dto.Lal_PrevisaoResponse;
import com.Lal_polinomio.lal_polinomio.util.Lal_Calcular;

@Service
public class Lal_Previsao {

    public Lal_PrevisaoResponse verificarPrevisao(Lal_PrevisaoRequest request) {

        Lal_PrevisaoResponse resp = new Lal_PrevisaoResponse();
        resp.setLal_ano(request.getLal_anoPrevisao());
        resp.setLal_grauPolinomio(request.getLal_grauPolinomio());
        resp.setLal_tipoPolinomio(request.getLal_tipoPolinomio());

        if (request.getLal_grauPolinomio() == 1) {
            double valor = Lal_Calcular.lal_calcularLinear(request.getLal_anoPrevisao());

            resp.setLal_valorPrevisto(valor);
            resp.setLal_tipoPolinomio("Linear");
            resp.setLal_formula("f(x) = ax+b");
            resp.setLal_mensagem("Previsão calculada com sucesso");
            return resp;
        }

        if(request.getLal_tipoPolinomio().equals("Simples")){
            double valor = Lal_Calcular.lal_calcularPolinomialSimples(request.getLal_anoPrevisao(), request.getLal_grauPolinomio());

            resp.setLal_valorPrevisto(valor);
            resp.setLal_formula("f(x) = ax2+bx+c");
            resp.setLal_mensagem("Previsão calculada com sucesso");
            return resp;
        }

        if(request.getLal_tipoPolinomio().equals("Multiplo")){
            double valor = Lal_Calcular.lal_calcularPolinomialMultiplo(request.getLal_anoPrevisao(), request.getLal_grauPolinomio(), request.getLal_percentualPrevisao());

            resp.setLal_valorPrevisto(valor);
            resp.setLal_percentualPrevisao(request.getLal_percentualPrevisao());
            resp.setLal_formula("f(x,y) = a + bx + cy");
            resp.setLal_mensagem("Previsão calculada com sucesso");
            return resp;
        }

        return null;
    }

}
