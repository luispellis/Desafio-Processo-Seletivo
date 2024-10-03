public class ProcessoSeletivo {

    // Vamos explorar alguns outros cenários com fluxo condicionais, repetições e excepcionais.

    // Case 1: Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:

    // Se o valor salario base for maior que o valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO";
    // Senão se o valor salario base for igual ao valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
    // Senão imprima: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";
    
    public static void main(String[] args) {
        analisarCandidato(1900.0);
    }

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
