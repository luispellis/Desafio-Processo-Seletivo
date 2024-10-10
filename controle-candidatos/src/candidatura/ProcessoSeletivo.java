import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    // Vamos explorar alguns outros cenários com fluxo condicionais, repetições e excepcionais.
    
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    // Case 2: Foi solicitado que o nosso sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos
    // para a entrevista onde o salário pretendido seja menor ou igual ao salário base.

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE",};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + "solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    // Case 1: Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:
    // Se o valor salario base for maior que o valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO";
    // Senão se o valor salario base for igual ao valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
    // Senão imprima: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0; 
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }

}
