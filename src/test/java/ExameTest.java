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

    @Test
    public void quandoVerificarColesterolHDL_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setColesterolHDL(0);
            exame.verificarNivelColesterolHDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Colesterol HDL.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarColesterolHDL_deveRetornarBaixo() {
        Exame exame = new Exame();
        exame.setColesterolHDL(39);

        assertEquals("Baixo", exame.verificarNivelColesterolHDL());
    }

    @Test
    public void quandoVerificarColesterolHDL_deveRetornarNormal() {
        Exame exame = new Exame();
        exame.setColesterolHDL(60);

        assertEquals("Normal", exame.verificarNivelColesterolHDL());
    }

    @Test
    public void quandoVerificarColesterolHDL_deveRetornarDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolHDL(61);

        assertEquals("Desejável", exame.verificarNivelColesterolHDL());
    }

    @Test
    public void quandoVerificarColesterolLDL_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setColesterolHDL(0);
            exame.verificarNivelColesterolLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Colesterol LDL.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarColesterolLDL_deveRetornarOtimo() {
        Exame exame = new Exame();
        exame.setColesterolLDL(99);

        assertEquals("Ótimo", exame.verificarNivelColesterolLDL());
    }

    @Test
    public void quandoVerificarColesterolLDL_deveRetornarDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolLDL(129);

        assertEquals("Desejável", exame.verificarNivelColesterolLDL());
    }

    @Test
    public void quandoVerificarColesterolLDL_deveRetornarLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolLDL(159);

        assertEquals("Limítrofe", exame.verificarNivelColesterolLDL());
    }

    @Test
    public void quandoVerificarColesterolLDL_deveRetornarAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(189);

        assertEquals("Alto", exame.verificarNivelColesterolLDL());
    }

    @Test
    public void quandoVerificarColesterolLDL_deveRetornarMuitoAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(190);

        assertEquals("Muito alto", exame.verificarNivelColesterolLDL());
    }

    @Test
    public void quandoVerificarColesteroVLDL_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setColesterolVLDL(0);
            exame.verificarNivelColesterolVLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Colesterol VLDL.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarColesterolVLDL_deveRetornarNivelDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(29);

        assertEquals("Nível desejável", exame.verificarNivelColesterolVLDL());
    }
    @Test
    public void quandoVerificarColesterolVLDL_deveRetornarNivelLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(40);

        assertEquals("Nível limítrofe", exame.verificarNivelColesterolVLDL());
    }

    @Test
    public void quandoVerificarColesterolVLDL_deveRetornarNivelElevado() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(41);

        assertEquals("Nível elevado", exame.verificarNivelColesterolVLDL());
    }

    @Test
    public void quandoVerificarGlicose_deveLancarExcecao() {
        try {
            Exame exame = new Exame();
            exame.setGlicose(0);
            exame.verificarNivelGlicose();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível verificar o nível de Glicose.", e.getMessage());
        }
    }

    @Test
    public void quandoVerificarGlicose_deveRetornarHipoglicemia() {
        Exame exame = new Exame();
        exame.setGlicose(59);

        assertEquals("Hipoglicemia", exame.verificarNivelGlicose());
    }

    @Test
    public void quandoVerificarGlicose_deveRetornarDesejavel() {
        Exame exame = new Exame();
        exame.setGlicose(99);

        assertEquals("Desejável", exame.verificarNivelGlicose());
    }

    @Test
    public void quandoVerificarGlicose_deveRetornarGlicemiaJejumInapropiada() {
        Exame exame = new Exame();
        exame.setGlicose(125);

        assertEquals("Glicemia de jejum inapropriada", exame.verificarNivelGlicose());
    }

    @Test
    public void quandoVerificarGlicose_deveRetornarDiabetes() {
        Exame exame = new Exame();
        exame.setGlicose(126);

        assertEquals("Diabetes", exame.verificarNivelGlicose());
    }
}