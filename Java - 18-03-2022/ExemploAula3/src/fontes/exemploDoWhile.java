
package fontes;
                //Do While executado pelo menos uma vez, o while não
import javax.swing.JOptionPane;

public class exemploDoWhile {
    public static void main(String[] args) {
        /*
        int i = 0;       //Ou faz antes ou depois - Não é onde, mas quando
                        //i++ = Primeiro faz a linha de comando, depois incrementa
        do{             //++i = primeiro incrementa, depois faz a linha de comando
            System.out.println(i++);
            
        } while(i < 10);
        */
    ///////////////////////////////////    
        int soma=0; //Variável declarada fora, pois quero mostrar ela
        
        do{
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Número "));
            soma += numero;
                            //ISSO N~~AO ESTÁ NA APOSTILA   
        } while(JOptionPane.showConfirmDialog(null, "Continuar?")==0); //Caixa de Confirmação
         //Devo continuar enquanto a confirmação for igual a Sim, continua, se não será Não ou Cancel
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
        
    }
}
