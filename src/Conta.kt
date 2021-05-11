open class Conta(var cliente: Cliente) {

    open fun depositar(valorDeposito:Float){}

    open fun sacar(valorSaque:Float){}

    fun consultaSaldo(){}
}