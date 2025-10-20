package com.Lal_polinomio.lal_polinomio.util;

import java.math.BigDecimal;

public class Lal_Calcular {
    
    private Lal_Calcular(){}

    public static double lal_calcularLinear(int lal_ano){

        return lal_ano * 19593953.577193 + (-39327262650.0965);

    }

    public static double lal_calcularPolinomialSimples(Integer lal_anoPrevisao, Integer lal_grauPolinomio) {

        if(lal_grauPolinomio == 2){
            return Math.pow(lal_anoPrevisao, 2) * 1364741.1282 + lal_anoPrevisao * -5480312793.02451 + 5501787842317.28;
        }

        if(lal_grauPolinomio == 3){
            return Math.pow(lal_anoPrevisao, 3) * 126784.306733471 + Math.pow(lal_anoPrevisao, 2) * -765046393.075927 + lal_anoPrevisao * 1538831301633.15 + (-1031751683643430.00);
        }

        if(lal_grauPolinomio == 4){
            return Math.pow(lal_anoPrevisao, 4) * 1267.18168709536 + Math.pow(lal_anoPrevisao, 3) * -10086700.0952318 + Math.pow(lal_anoPrevisao, 2) * 30105113375.0077 + lal_anoPrevisao * -39929823135659.3 + 19857886384023400.0;
        }

        if(lal_grauPolinomio == 5){
            return Math.pow(lal_anoPrevisao, 5) * -293.55113720334 + Math.pow(lal_anoPrevisao, 4) * 2958794.48808254 + Math.pow(lal_anoPrevisao, 3) * -11928891265.5804 + Math.pow(lal_anoPrevisao, 2) * 24046376737064.4 + lal_anoPrevisao * -24236144415821900.0 + 9770836589193940000.0;
        }

        return 1;
        
    }

    public static double lal_calcularPolinomialMultiplo(Integer lal_anoPrevisao, Integer lal_grauPolinomio, double lal_percentualPrevisao) {
        
        if(lal_grauPolinomio == 2){
            return 5309808750719.22 + -5289861661.87645 * lal_anoPrevisao + 526387.990432116 * lal_percentualPrevisao + Math.pow(lal_anoPrevisao, 2) * 1317505.43852827 + Math.pow(lal_percentualPrevisao, 2) * -1053.88390863482;
        }

        if(lal_grauPolinomio == 3){
            return -711370816391335.0 + 1061853150466.28 * lal_anoPrevisao + -828154.601697687 * lal_percentualPrevisao + Math.pow(lal_anoPrevisao, 2) * -528341663.081419 + Math.pow(lal_percentualPrevisao, 2) * 57572.876197308 + Math.pow(lal_anoPrevisao, 3) * 87628.8823520002 + Math.pow(lal_percentualPrevisao, 3) * -540.816805194443;
        }

        if(lal_grauPolinomio == 4){
            return 147987937122125000.0 + -294148185840600.0 * lal_anoPrevisao + -865700.694510428 * lal_percentualPrevisao + Math.pow(lal_anoPrevisao, 2) * 219249149722.089 + Math.pow(lal_percentualPrevisao, 2) * 29727.0890896772 + Math.pow(lal_anoPrevisao, 3) * -72631962.6366014 + Math.pow(lal_percentualPrevisao, 3) * 363.003953712385 + Math.pow(lal_anoPrevisao, 4) * 9022.9710593527 + Math.pow(lal_percentualPrevisao, 4) * -6.65579787705143;
        }

        if(lal_grauPolinomio == 5){
            return 23864081652023300000.0 + -59154820749655300.0 * lal_anoPrevisao + -1202939.19162151 * lal_percentualPrevisao + Math.pow(lal_anoPrevisao, 2) * 58653347304699.1 + Math.pow(lal_percentualPrevisao, 2) * -8924.1858098071 + Math.pow(lal_anoPrevisao, 3) * -29077877570.7824 + Math.pow(lal_percentualPrevisao, 3) * 3919.1803233075 + Math.pow(lal_anoPrevisao, 4) * 7207751.97461569 + Math.pow(lal_percentualPrevisao, 4) * -82.7132196260929 + Math.pow(lal_anoPrevisao, 5) * -714.651262456749 + Math.pow(lal_percentualPrevisao, 5) * 0.472784925224534;
        }

        return 1;
    }

}
