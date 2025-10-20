package com.Lal_polinomio.lal_polinomio.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Lal_polinomio.lal_polinomio.dto.Lal_PrevisaoRequest;
import com.Lal_polinomio.lal_polinomio.dto.Lal_PrevisaoResponse;
import com.Lal_polinomio.lal_polinomio.service.Lal_Previsao;

@Controller
public class Lal_GastosController {

    @Autowired
    Lal_Previsao lal_Previsao;
    
    @GetMapping("/gastos")
    public String gastos(Model lal_model) {
        lal_model.addAttribute("Lal_previsaoRequest", new Lal_PrevisaoRequest());
        return "Lal_index";
    }

    @PostMapping("/gastos/corpo")
    public String calcularPrevisao(@ModelAttribute  Lal_PrevisaoRequest lal_request, Model lal_model) {
       
        Lal_PrevisaoResponse lal_resposta = lal_Previsao.verificarPrevisao(lal_request);

        lal_model.addAttribute("Lal_previsaoResponse", lal_resposta);

        lal_model.addAttribute("Lal_previsaoRequest", lal_request);

        return "Lal_index";
        
    }

}
