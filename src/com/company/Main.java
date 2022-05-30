package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Создатьприложение,котороебудетсчитыватьсконсолиданныеосотруднике.Программа
 * запрашиваетупользователяследующиеданныеипослерассчитываетивыводитегообщий
 * рабочий стаж.
 * ●Имя
 * ●Фамилия
 * ●Год рождения
 * ●Год начала работы
 * При вводе данных, программа должна обработать следующие исключения:
 * ●Ввод чисел вместо имени, фамилии
 * ●Ввод нечисловых символов вместо года рождения и года начала работы
 * ●Ввод года рождения и года начала работы из будущего
 * ●Ввод года начала работы более раннего, чем год, когда работнику исполнилось 18 леt
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);




        while (true) {
            try {
                System.out.println("Write name: ");
                String name = scanner.nextLine();
                if (!name.matches("^[A-Za-z]*$")) {
                    throw new Exceptions("Name can't contain numbers!");
                }
                System.out.println("Write surname: ");
                String surName = scanner.nextLine();
                if (!surName.matches("^[A-Za-z]*$")) {
                    throw new Exceptions("Surname can't contain numbers!");
                }
                System.out.println("Write year of birth: ");
                int yearsOfBirth = scanner.nextInt();
                if (yearsOfBirth > 2022) {
                    throw new Exceptions("Person can't be older then 2022 year.");
                }
                System.out.println("Write year of start worked: ");
                int yearsOfStartWorked = scanner.nextInt();
                if (yearsOfStartWorked > 2022) {
                    throw new Exceptions("Person start worked year can't be greater than 2022 year!");
                }
                if (yearsOfBirth < 0) {
                    throw new Exceptions("Person birth year can't be negative!");
                }
                if (yearsOfStartWorked < 0) {
                    throw new Exceptions("Person start worked year can't be negative!");
                }
                if (yearsOfBirth + 18 > yearsOfStartWorked) {
                    throw new Exceptions("Person age can't be less 18, when he/she start worked.");
                }
                Person person = new Person(name,surName,yearsOfBirth,yearsOfStartWorked);
                person.getInfo();
            } catch (Exceptions e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException exception) {
                System.out.println("Year can't contain letters.");
            }
        }
    }
}
