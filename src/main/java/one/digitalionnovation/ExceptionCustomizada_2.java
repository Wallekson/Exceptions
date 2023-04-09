package one.digitalionnovation;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {  // throw DivisaoNaoExataExecption - se não lançamos aqui esta errado pois não tratamos
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataExecption("Divisão não exata!", numerador[i], denominador[i]);
                if (denominador[i] == 0)
                    throw new DivisaoporZero("Não é possivel dividir por zero", numerador[i], denominador[i]);


                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataExecption | ArithmeticException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Denominador sem numerador para dividir");
            }

        }
        System.out.println("O programa continua...");

    }
}

