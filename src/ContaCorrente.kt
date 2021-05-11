

class ContaCorrente(cliente: Cliente, var saldoCorrente:Float = 0F):Conta(cliente) {

    override fun depositar(valorDeposito: Float){
        this.saldoCorrente += valorDeposito
        println("Valor de R$$valorDeposito depositado. Seu saldo é de: $saldoCorrente")
    }

    override fun sacar(valorSaque:Float){
        this.saldoCorrente -= valorSaque
        println("Valor de R$$valorSaque depositado. Seu saldo é de: ${this.saldoCorrente}")
    }

    fun depositarCheque(valorCheque:Float, bancoEmissor:String, dataPagamento:String){
        saldoCorrente += valorCheque
        println("Cheque no valor de R$$valorCheque depositado na data $dataPagamento pelo banco $bancoEmissor depositado.")
    }
}