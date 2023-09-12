package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает сервис банка, который включает в себя:
 * возможность создавать нового пользователя
 * возможность удалять пользователя
 * добавлять пользователю банковский счет
 * переводить деньги с одного счета на другой
 * @author Ermolaev Vlad
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение пользователя с его счетами осуществляется в коллекции HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добаляет его в систему
     * @param user пользователь банка
     */
    public void addUser(User user) {
            users.put(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход паспорт пользователя и удаляет
     * пользователя из системы
     * @param passport паспорт пользователя
     * @return вовзращает результат удаления пользователя
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод принимает на вход паспорт пользователя и счет, который
     * необходимо добавить к пользователю
     * @param passport паспорт пользователя
     * @param account счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> value = users.get(user);
            if (!value.contains(account)) {
                value.add(account);
            }
        }
    }

    /**
     * Метод принмает на вход паспорт пользователя и находит
     * пользователя в системе по паспорту
     * @param passport паспорт пользователя
     * @return возвращает пользователя или null если пользовательне найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает на вход паспорт пользотеля и реквизиты счета и
     * по ним находит счет пользователя
     * @param passport паспорт пользователя
     * @param requisite реквизиты банковского счета
     * @return возвращает банковский счет или null если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user  = findByPassport(passport);
        if (user != null) {
            List<Account> value = users.get(user);
                rsl = value.stream()
                        .filter(s -> s.getRequisite().equals(requisite))
                        .findFirst()
                        .orElse(null);
        }
        return rsl;
    }

    /**
     * Метод позволяет перечислить деньги с одного счета на другой
     * на вход принимаюся паспорт и реквизиты обоих счетов и сумма,
     * которую необходимо перевести
     * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма перевода
     * @return возвращает статус результата перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        destAccount.setBalance(destAccount.getBalance() + amount);
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        return true;
    }

    /**
     * Метод принимает на вход пользователя и получает его счет
     * @param user пользователь
     * @return возвращает счет пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
