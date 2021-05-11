class ContaPoupanca(cliente: Cliente, val juros:Double, var saldoPoupanca:Double):Conta(cliente){   //Instancia Cliente no proprio construtor

    fun recolherJuros(){
        this.saldoPoupanca *= (juros * 30)
    }

    override fun deposito(saldoPoupanca: Double, valorDeposito: Float){
        this.
    }

    override fun sacar(){
        super.sacar(5F)
    }
}