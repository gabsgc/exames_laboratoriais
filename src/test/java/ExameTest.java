import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExameTest {

    @Test
    public void quandoVerificarTriglicerides_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setTriglicerides(0);
            exame.verificarNivelTriglicerides();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Triglicerides.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelDesejavel() {
        Exame exame = new Exame();
        exame.setTriglicerides(149);

        assertEquals("Nível desejável", exame.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelLimitrofe() {
        Exame exame = new Exame();
        exame.setTriglicerides(199);

        assertEquals("Nível limitrofe", exame.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(499);

        assertEquals("Nível alto", exame.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelMuitoAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(500);

        assertEquals("Nível muito alto", exame.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarColesterolTotal_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setColesterolTotal(0);
            exame.verificarNivelColesterolTotal();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Colesterol Total.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarColesterolTotal_deveRetornarDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolTotal(199);

        assertEquals("Desejável", exame.verificarNivelColesterolTotal());
    }

    @Test
    public void quandoVerificarColesterolTotal_deveRetornarLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolTotal(239);

        assertEquals("Limítrofe", exame.verificarNivelColesterolTotal());
    }

    @Test
    public void quandoVerificarColesterolTotal_deveRetornarElevado() {
        Exame exame = new Exame();
        exame.setColesterolTotal(240);

        assertEquals("Elevado", exame.verificarNivelColesterolTotal());
    }
}