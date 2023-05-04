public class GherkinScenarios {

    /**
     * #Feature: Depósito em Conta
     *
     * Cenário Otimista: Depósito bem sucedido
     *
     * Dado que o usuário está logado na conta
     * E possui um saldo de R$ 2400,00
     * Quando ele realiza um depósito de R$ 500,00
     * Então o saldo da conta deve ser R$ 2900,00
     *
     * Cenário Pessimista: Valor de depósito inválido
     *
     * Dado que o usuário está logado na conta
     * E possui um saldo de R$ 2400,00
     * Quando ele tenta fazer um depósito de um valor igual ou inferior a zero
     * Então o depósito não deve ser realizado
     * E uma mensagem de erro deve ser exibida
     *
     * Cenário de Falha Total: Sistema indisponível
     *
     * Dado que o usuário está logado na conta
     * E o sistema está indisponível
     * Quando ele tenta fazer um depósito
     * Então o depósito não deve ser efetuado
     * E uma mensagem de erro de sistema indisponível deve ser exibida
     *
     *
     * # Feature: Saque em Conta
     *
     * Cenário Otimista: Saque bem sucedido
     *
     * Dado que o usuário está logado na sua conta
     * E tem um saldo de R$ 2000,00
     * Quando ele faz um saque de R$ 500,00
     * Então o saldo atual da conta deve ser R$ 1500,00
     *
     * Cenário Pessimista: Saldo insuficiente
     *
     * Dado que o usuário está logado na sua conta
     * E tem um saldo de R$ 200,00
     * Quando ele tenta fazer um saque de R$ 1500,00
     * Então o saque não deve ser efetuado
     * E uma mensagem de erro de saldo insuficiente deve ser exibida
     *
     * Cenário de Falha Total: Sistema indisponível
     *
     * Dado que o usuário está logado na conta
     * E o sistema está indisponível
     * Quando ele tenta realizar um saque
     * Então o saque não deve ser efetuado
     * E uma mensagem de erro de sistema indisponível deve ser exibida
     *
     *
     * # Feature: Transferência de Contas
     *
     * Cenário Otimista: Transferência bem sucedida
     *
     * Dado que o usuário está logado na conta
     * E tem um saldo de R$ 1000,00
     * E quer transferir R$ 500,00 para outra conta
     * Quando ele confirma a transferência
     * Então o saldo da conta origem deve ser R$ 500,00
     * E o saldo da conta destino deve ser R$ 500,00 mais o já existente
     *
     * Cenário Pessimista: Conta de destino inválida
     *
     * Dado que o usuário está logado na conta
     * E quer transferir R$ 500,00 para uma conta inválida
     * Quando ele confirma a transferência
     * Então a transferência não deve ser realizada
     * E uma mensagem de erro de conta inválida deve ser exibida
     *
     * Cenário de Falha Total: Sistema indisponível
     *
     * Dado que o usuário está logado na conta
     * E o sistema está indisponível
     * Quando ele tenta fazer uma transferência
     * Então a transferência não deve ser efetuada
     * E uma mensagem de erro de sistema indisponível deve ser exibida
     */

}