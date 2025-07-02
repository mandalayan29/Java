package org.example.serialize;

import java.io.*;

public class SerializeMain {

    static String path= "D:\\GIT_REPOS\\Java\\temp\\file.txt";

    public static void serializeUser() {
        User user= new User(1, "Ayan", 27);
        try {
            FileOutputStream fOut= new FileOutputStream(path);
            ObjectOutputStream oOut= new ObjectOutputStream(fOut);
            oOut.writeObject(user);
            System.out.println("Completed");
            fOut.close();
            oOut.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializeUser() {
        try {
            FileInputStream fin= new FileInputStream(path);
            ObjectInputStream oin= new ObjectInputStream(fin);
            User u = (User) oin.readObject();
            System.out.println("Completed");
            System.out.println(u.toString());
            fin.close();
            oin.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

//        serializeUser();
        deserializeUser();
    }

}
