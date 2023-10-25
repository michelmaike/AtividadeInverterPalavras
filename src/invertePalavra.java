import java.util.Stack;

public class invertePalavra {

    public static String inverterPalavras(String s) {
        Stack<Character> pilha = new Stack<>();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(c);
            } else {
                pilha.push(c);
            }
        }
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String s = "ESTE EXERCICIO E MUITO FACIL";
        System.out.println("ESTE EXERCICIO E MUITO FACIL");
        System.out.println(inverterPalavras(s));

        System.out.println("");

        s = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println("UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE");
        System.out.println(inverterPalavras(s));

        System.out.println("");

        s = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        System.out.println("ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG");
        System.out.println(inverterPalavras(s));
    }
}
