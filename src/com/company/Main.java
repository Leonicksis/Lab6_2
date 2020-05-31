package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("Input.txt");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        boolean flag=true;
        try (Scanner scan = new Scanner(input)) {

            while (scan.hasNextLine()) {

                String buf = scan.nextLine();
                String[] buf_ = buf.split(" ");
                for (int i = 0; i < buf_.length; i++) {
                    if (flag==true) {
                        if (Integer.parseInt(buf_[i])>0) {
                            int int_ = Integer.parseInt(buf_[i]);
                            list1.add(int_);
                        }
                        else{ flag=false;}
                    }
                    else {
                        int int_ = Integer.parseInt(buf_[i]);
                        list2.add(int_);
                    }
                }
            }
        }
        catch (FileNotFoundException exp) {
                System.out.println("No such file found!");
            }

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Sorted list 1: " + list1);
        System.out.println("Sorted list 2: " + list2);
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Sorted all: " + list1);

    }
}