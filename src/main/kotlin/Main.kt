
const val minCommission = 35*100;
const val percentCommission = 0.0075;


fun main(){
    val amount1 = 1000000;
    val amount2 = 10000;

    print(amount1);
    print(amount2);
}

fun print(amount: Int){
    val commission1 = if (amount * percentCommission > minCommission) (amount * percentCommission).toInt() else minCommission;
    println("Сумма: $amount коп; Комиссия: $commission1 коп");
}