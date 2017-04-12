package com.codecool.tobeornottobe.mentorslife;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonReader {

    static void readPersonFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            String fName = scanner.next();
            String lName = scanner.next();
            int bYear = Integer.parseInt(scanner.next());
            String gender = scanner.next();
            String nickname = scanner.next();
            Mentor mentor = new Mentor(fName, lName, bYear, gender, nickname);
            if (scanner.hasNext()) {
               // scanner.nextLine();
            }
            System.out.println(mentor);
            //System.out.print(scanner.next()+" ");
        }
        scanner.close();
}
}
