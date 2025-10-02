package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone?");
        cellPhone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        cellPhone.setOwner(scanner.nextLine());

        System.out.println(cellPhone);

        cellPhone.dial("855-555-2222");

        CellPhone cellPhone1 = new CellPhone(1346, "Samsung Galaxy", "Sprint", "623-897-2467", "Malika");

        System.out.println(cellPhone1);


    }

}


