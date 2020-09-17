fun main(){
    val minCommission = 35*100;
    val percentCommission = 0.0075;

    val amount1 = 1000000;
    val amount2 = 10000;

    val commission1 = if (amount1 * percentCommission > minCommission) (amount1 * percentCommission).toInt() else minCommission;
    println("Сумма: $amount1 коп; Комиссия: $commission1 коп");
    val commission2 = if (amount2 * percentCommission > minCommission) (amount2 * percentCommission).toInt() else minCommission;
    println("Сумма: $amount2 коп; Комиссия: $commission2 коп");

}

