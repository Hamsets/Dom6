package academy.belhard;

import academy.belhard.entitiy.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tom","Hardy","tom.hardy@mail.ru", "1234");
        System.out.println(user.getFullInfo());

        System.out.println("Проверяем на соответсвие пароля (в User внесен пароль 1234)");
        System.out.println("1. Проверяем пароль 4321. Результат - " + user.isPasswordCorrect("4321"));
        System.out.println("2. Проверяем пароль 1234. Результат - " + user.isPasswordCorrect("1234"));
    }
}