package org.example;

import java.io.*;
import java.util.Scanner;


/**
 * Hello world!I
 * Integer registration_number,age;
 *     private String name,email,address;
 *
 */
public class App implements Apps,Serializable {

    File file = new File("data.txt");

    // Map<Integer,Details> students=new TreeMap<>();
    @Override
    public void addDetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer registration_number, age;
        String name, email, address;
        System.out.println("Enter registration number");
        registration_number = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter email");
        email = sc.next();
        System.out.println("Enter address");
        address = sc.next();
        Details details = new Details(registration_number, age, name, email, address);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(details.toString());
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void viewDetails() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
        fileInputStream.close();


    }


    // File file=new File("data.txt");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        App obj = new App();
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1.Add details\n2.view details\n3.exit\n");
            switch (sc.nextInt()) {
                case 1:
                    obj.addDetails();
                    break;
                case 2:
                    obj.viewDetails();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}

