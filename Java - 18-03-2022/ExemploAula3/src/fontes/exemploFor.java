
package fontes;

public class exemploFor {
    public static void main(String[] args) {
        
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);    
        }
        */
        //Ordena primeiro os maiusculos, depois os minusculos = Tabela ASC II
        //Os caracteres aparecem por causa da Tabela Asc II = 255 characteres = codificou
        for (char c = 'A'; c <= 'z'; c++){ //For para mostrar as letras de a a z
            System.out.println(""+c); //Pega todos os minusculos e maiusculos   
        }
        
    }
}
