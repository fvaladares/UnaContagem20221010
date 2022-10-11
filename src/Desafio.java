public class Desafio {
    int qtdLinhas = 4;
    public void quadrado() {
        int i;
        int j;
        // for para controlar as linhas
        for (i = 0; i < qtdLinhas; i++) {
            // for para controlar as colunas
            for (j = 0; j < qtdLinhas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

