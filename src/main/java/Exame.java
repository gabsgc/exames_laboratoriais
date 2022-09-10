import lombok.Setter;

@Setter
public class Exame {
    private int triglicerides;
    private int colesterolTotal;
    private int colesterolHDL;
    private int colesterolLDL;
    private int colesterolVLDL;
    private int glicose;

    private static final int ZERO = 0;
    private static final int LIMITE_TRIGLICERIDES_DESEJAVEL = 150;
    private static final int LIMITE_TRIGLICERIDES_LIMITROFE = 199;
    private static final int LIMITE_TRIGLICERIDES_ALTO = 499;

    private static final int LIMITE_COLESTEROL_TOTAL_DESEJAVEL = 200;
    private static final int LIMITE_COLESTEROL_TOTAL_LIMITROFE = 239;

    private static final int LIMITE_COLESTEROL_HDL_BAIXO = 40;
    private static final int LIMITE_COLESTEROL_HDL_NORMAL = 60;

    private static final int LIMITE_COLESTEROL_LDL_OTIMO = 100;
    private static final int LIMITE_COLESTEROL_LDL_DESEJAVEL = 129;
    private static final int LIMITE_COLESTEROL_LDL_LIMITROFE = 159;
    private static final int LIMITE_COLESTEROL_LDL_ALTO = 189;

    private static final int LIMITE_COLESTEROL_VLDL_DESEJAVEL = 30;
    private static final int LIMITE_COLESTEROL_VLDL_LIMITROFE = 40;

    private static final int LIMITE_COLESTEROL_GLICOSE_HIPOGLICEMIA = 60;
    private static final int LIMITE_COLESTEROL_GLICOSE_DESEJAVEL = 99;
    private static final int LIMITE_COLESTEROL_GLICOSE_GLICEMIA_JEJUM_INAPROPIADA = 125;

    public String verificarNivelTriglicerides() {
        if (this.triglicerides <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Triglicerides.");
        }
        if (this.triglicerides < LIMITE_TRIGLICERIDES_DESEJAVEL) {
            return "Nível desejável";
        }
        if (this.triglicerides <= LIMITE_TRIGLICERIDES_LIMITROFE) {
            return "Nível limitrofe";
        }
        if (this.triglicerides <= LIMITE_TRIGLICERIDES_ALTO) {
            return "Nível alto";
        } else {
            return "Nível muito alto";
        }
    }

    public String verificarNivelColesterolTotal() {
        if (this.colesterolTotal <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Colesterol Total.");
        }
        if (this.colesterolTotal < LIMITE_COLESTEROL_TOTAL_DESEJAVEL) {
            return "Desejável";
        }
        if (this.colesterolTotal <= LIMITE_COLESTEROL_TOTAL_LIMITROFE) {
            return "Limítrofe";
        } else {
            return "Elevado";
        }
    }

    public String verificarNivelColesterolHDL() {
        if (this.colesterolHDL <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Colesterol HDL.");
        }
        if (this.colesterolHDL < LIMITE_COLESTEROL_HDL_BAIXO) {
            return "Baixo";
        }
        if (this.colesterolHDL <= LIMITE_COLESTEROL_HDL_NORMAL) {
            return "Normal";
        } else {
            return "Desejável";
        }
    }

    public String verificarNivelColesterolLDL() {
        if (this.colesterolLDL <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Colesterol LDL.");
        }
        if (this.colesterolLDL < LIMITE_COLESTEROL_LDL_OTIMO) {
            return "Ótimo";
        }
        if (this.colesterolLDL <= LIMITE_COLESTEROL_LDL_DESEJAVEL) {
            return "Desejável";
        }
        if (this.colesterolLDL <= LIMITE_COLESTEROL_LDL_LIMITROFE) {
            return "Limítrofe";
        }
        if (this.colesterolLDL <= LIMITE_COLESTEROL_LDL_ALTO) {
            return "Alto";
        } else {
            return "Muito alto";
        }
    }

    public String verificarNivelColesterolVLDL() {
        if (this.colesterolVLDL <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Colesterol VLDL.");
        }
        if (this.colesterolVLDL < LIMITE_COLESTEROL_VLDL_DESEJAVEL) {
            return "Nível desejável";
        }
        if (this.colesterolVLDL <= LIMITE_COLESTEROL_VLDL_LIMITROFE) {
            return "Nível limítrofe";
        } else {
            return "Nível elevado";
        }
    }

    public String verificarNivelGlicose() {
        if (this.glicose <= ZERO) {
            throw new IllegalArgumentException("Não foi possível verificar o nível de Glicose.");
        }
        if (this.glicose < LIMITE_COLESTEROL_GLICOSE_HIPOGLICEMIA) {
            return "Hipoglicemia";
        }
        if (this.glicose <= LIMITE_COLESTEROL_GLICOSE_DESEJAVEL) {
            return "Desejável";
        }
        if (this.glicose <= LIMITE_COLESTEROL_GLICOSE_GLICEMIA_JEJUM_INAPROPIADA) {
            return "Glicemia de jejum inapropriada";
        } else {
            return "Diabetes";
        }
    }
}
