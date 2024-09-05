package questao2;

public class Questao2 {
    /*Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
     além de informar a quantidade de vezes em que ela ocorre. */

    public static void verificaLetra(String string, char letra) {

        String textoMinusculo = string.toLowerCase();
        char letraMinuscula = Character.toLowerCase(letra);
        int cont = 0;

        for (int i = 0; i < textoMinusculo.length(); i++) {
            if (textoMinusculo.charAt(i) == letraMinuscula) {
                cont++;
            }
        }

        if (cont!=0){
            System.out.println("a letra " + letra + " ocorre " + cont + " vezes nessa string");
        } else {
            System.out.println("a letra " + letra + " não existe nessa string");
        }

    }

}
