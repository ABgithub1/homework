package by.academy.homework3.Deal;

import java.util.Scanner;

public class Info {
    protected static void validateInfo(User buyer) {
        Scanner sc1 = new Scanner(System.in);
        Validator dateOfBirth = new DataValidator();
        Validator phone = new BelPhoneValidator();
        Validator email = new EmailValidator();

        System.out.println("Введите дату рождения");
        do {
            String uDate = sc1.nextLine();
            if (!dateOfBirth.isValid(uDate)) {
                System.err.println("Ошибка, повторите ввод");
            } else {
                buyer.setDateOfBirth(uDate);

            }
        } while (buyer.getDateOfBirth() == null);

        System.out.println("Введите номер телефона (+375... или 80...)");
        do {
            String uPhone = sc1.nextLine();
            if (!phone.isValid(uPhone)) {
                System.err.println("Ошибка, повторите ввод");
            } else {
                buyer.setPhone(uPhone);
            }
        } while (buyer.getPhone() == null);

        System.out.println("Введите Email");
        do {
            String uEmail = sc1.nextLine();
            if (!email.isValid(uEmail)) {
                System.err.println("Ошибка, повторите ввод");
            } else {
                buyer.setEmail(uEmail);
            }
        } while (buyer.getEmail() == null);
    }
}
