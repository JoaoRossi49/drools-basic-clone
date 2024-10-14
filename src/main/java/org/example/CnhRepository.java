package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CnhRepository {
    public static List<Cnh> getCnhs() {

        Cnh cnh1 = new Cnh();
        cnh1.setNumero("CNH-40");
        cnh1.setNome("João Rossi");
        cnh1.setPontos(0);
        cnh1.setDataExpiracao(LocalDate.of(2022, Month.MAY, 28));

        Cnh cnh2 = new Cnh();
        cnh2.setNumero("CNH-50");
        cnh2.setNome("Rossi João");
        cnh2.setPontos(25);
        cnh2.setDataExpiracao(LocalDate.of(2024, Month.APRIL, 30));

        Cnh cnh3 = new Cnh();
        cnh3.setNumero("CNH-80");
        cnh3.setNome("Vitor Figueiredo");
        cnh3.setPontos(10);
        cnh3.setDataExpiracao(LocalDate.of(2024, Month.APRIL, 30));

        Cnh cnh4 = new Cnh();
        cnh4.setNumero("CNH-70");
        cnh4.setNome("Figueiredo Vitor");
        cnh4.setPontos(15);
        cnh4.setDataExpiracao(LocalDate.of(2024, Month.APRIL, 30));

        return new ArrayList<>(Arrays.asList(cnh1, cnh2, cnh3, cnh4));
    }
}