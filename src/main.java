class main{
    public static void main(String[] args) {
        int refill = 2000;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int balance = 100 + refill + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}