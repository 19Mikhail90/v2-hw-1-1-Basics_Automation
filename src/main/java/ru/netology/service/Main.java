package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        System.out.println("Бонусы будут начислены при дополнительной покупке на сумму " +result+ " рублей");
    }
}