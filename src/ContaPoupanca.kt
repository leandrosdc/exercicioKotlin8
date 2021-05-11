class ContaPoupanca(cliente: Cliente, val juros:Float = 0.02F, var saldoPoupanca:Float):Conta(cliente){   //Instancia Cliente no proprio construtor

    fun recolherJuros(){
        this.saldoPoupanca *= juros
        println("Valor de juros recolhido. Seu saldo é de: ${this.saldoPoupanca}")
    }

    override fun depositar(valorDeposito: Float){
        this.saldoPoupanca += valorDeposito
        println("Valor de R$$valorDeposito depositado. Seu saldo é de: ${this.saldoPoupanca}")
    }

    override fun sacar(valorSaque:Float){
        this.saldoPoupanca -= valorSaque
        println("Valor de R$$valorSaque depositado. Seu saldo é de: ${this.saldoPoupanca}")
    }

    fun consultaSaldoPoupanca() {
        println("Seu saldo Poupança é de R$${this.saldoPoupanca}")
    }
}