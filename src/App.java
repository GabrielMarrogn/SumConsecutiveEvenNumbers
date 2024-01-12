import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        for(;;){
            int entrada = Integer.parseInt(br.readLine());
            int contagem = 0;
            int soma = 0;
            if(entrada == 0){
                break;
            }

            for(int i = entrada;;i++){
                if(i%2 == 0){
                    soma += i;
                    contagem++;
                }if(contagem == 5){
                    break;
                }
            }

            System.out.println(soma);
        }
    }
}
