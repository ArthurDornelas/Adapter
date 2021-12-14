package test;

import org.junit.jupiter.api.Test;
import padrao.adapter.Resposta;

import static org.junit.jupiter.api.Assertions.*;

public class RespostaTest {

    @Test
    void deveRetornarDadosXML() {
        Resposta resposta = new Resposta();
        resposta.setDados("<");

        assertEquals("<", resposta.getDados());
    }

    @Test
    void deveRetornarDadosJSON() {
        Resposta resposta = new Resposta();
        resposta.setDados("<");

        assertEquals("{", resposta.getDadosJSON());
    }
}
