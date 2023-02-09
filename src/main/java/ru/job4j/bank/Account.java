package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета.
 */

public class Account {
    /**
     * поле содержит реквизиты банковского счета.
     */
    private String requisite;
    /**
     * поле содержит баланс банковского счета
     */
    private double balance;

    /**
     * Конструктор принимает на вход реквизиты и баланс банковского счета
     * и записывает в создаваемый объект
     * @param requisite реквизиты банковского счета
     * @param balance баланс банковского счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизиты банковского счета
     * @return возвращает реквизиты банковского счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет изменить реквизиты банковского счета
     * на вход принимаются новые данные реквизитов
     * @param requisite новые реквизиты банковского счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс банковского счета
     * @return возвращает баланс банковского счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет изменить баланс банковского счета
     * на вход принимаются новые значения баланса
     * @param balance новый баланс банковского счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнивает 2 объекта
     * @param o объект с которым необходимо сравнить
     * @return возвращает результат сравнивания 2-х объектов
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * метод позволяет получить hash код объекта
     * @return возвращает hash код
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
