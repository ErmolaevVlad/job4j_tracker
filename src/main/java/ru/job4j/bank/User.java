package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 * @author Ermolaev Vlad
 * @version 1.0
 */

public class User {
    /**
     * поле содержит паспортные данные пользователя.
     */
    private String passport;
    /**
     * поле содержит ФИО пользователя.
     */
    private String username;

    /**
     * Конструктор принимает на вход паспорт и ФИО пользователя
     * и записывает в создаваемый объект
     * @param passport паспорт пользователя
     * @param username ФИО пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить паспорт пользователя
     * @return возвращает паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет изменить паспорт пользователя
     * на вход принимаюся новые значения паспорта
     * @param passport новые значения паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить ФИО пользователя
     * @return возвращает ФИО пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет изменить ФИО пользователя
     * на вход принимаюся новое ФИО пользователя
     * @param username новое ФИО пользователя
     */
    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * метод позволяет получить hash код объекта
     * @return возвращает hash код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
