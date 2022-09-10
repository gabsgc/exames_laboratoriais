import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExameTest {

    @Test
    public void quandoVerificarTriglicerides_deveLancarExcecao() {
        try {
            Exame exameTriglicerides = new Exame();
            exameTriglicerides.setTriglicerides(0);
            exameTriglicerides.verificarNivelTriglicerides();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Triglicerides.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelDesejavel() {
        Exame exameTriglicerides = new Exame();
        exameTriglicerides.setTriglicerides(149);

        assertEquals("Nível desejável", exameTriglicerides.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelLimitrofe() {
        Exame exameTriglicerides = new Exame();
        exameTriglicerides.setTriglicerides(199);

        assertEquals("Nível limitrofe", exameTriglicerides.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelAlto() {
        Exame exameTriglicerides = new Exame();
        exameTriglicerides.setTriglicerides(499);

        assertEquals("Nível alto", exameTriglicerides.verificarNivelTriglicerides());
    }

    @Test
    public void quandoVerificarTriglicerides_deveRetornarNivelMuitoAlto() {
        Exame exameTriglicerides = new Exame();
        exameTriglicerides.setTriglicerides(500);

        assertEquals("Nível muito alto", exameTriglicerides.verificarNivelTriglicerides());
    }

}