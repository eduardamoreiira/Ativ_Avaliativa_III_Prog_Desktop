package aula01_Desk;

import java.util.ArrayList;

public class ConsultaEstoque {

    public static void main(String[] args) {

        ArrayList<Estoque> produtos = new ArrayList<>();

        // Frases de interação
        System.out.println("Olá, seja bem-vindo(a)!");
        System.out.println("Por favor, digite a opção desejada:");

        while (true) {
            int opcao = Teclado.lerInteiro(
                    "\n1. Cadastrar Produto\n2. Consultar Estoque\n3. Incluir Estoque\n4. Retirar Estoque\n5. Sair do Sistema");
            switch (opcao) {
                case 1:
                    int codigo = Teclado.lerInteiro("Digite o código do produto que deseja cadastrar:");
                    String descricao = Teclado.lerString("Digite a descrição do produto:");
                    Estoque produto = new Estoque(codigo, descricao);
                    produtos.add(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Estoque Atual:");
                    for (Estoque p : produtos) {
                        System.out.println(p.consultarProduto());
                    }
                    break;

                case 3:
                    codigo = Teclado.lerInteiro("Digite o código do produto para incluir estoque:");
                    int incluir = Teclado.lerInteiro("Digite a quantidade que deseja incluir no estoque:");
                    for (Estoque p : produtos) {
                        if (p.getCodigo() == codigo) {
                            p.incluir(incluir);
                            System.out.println("Estoque incluído com sucesso!");
                            break;
                        }
                    }
                    break;

                case 4:
                    codigo = Teclado.lerInteiro("Digite o código do produto para retirar estoque:");
                    int retirar = Teclado.lerInteiro("Digite a quantidade que deseja retirar do estoque:");
                    for (Estoque p : produtos) {
                        if (p.getCodigo() == codigo) {
                            if (p.retirar(retirar)) {
                                System.out.println("Estoque retirado com sucesso!");
                            } else {
                                System.out.println("Quantidade insuficiente no estoque!");
                            }
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema, até a próxima!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
