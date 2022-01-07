/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07021;
import java.util.*;
import java.io.*;
/**
 *
 * @author Lenovo
 */
public class Sinhvien {
    public static void main(String[] args) throws IOException{
        Scanner in=new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            String s=in.nextLine().toLowerCase().trim();
            if(s.equals("end")){
                break;
            }
            StringBuilder str= new StringBuilder(s);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' ' && str.charAt(j+1)==' '){
                    str.deleteCharAt(j);
                    j--;
                }
            }
            String a=new String(str);
            char [] character=a.toCharArray();
            boolean dc=true;
            for(int k=0;k<a.length();k++){
                if(Character.isLetter(character[k])){
                    if(dc){
                        character[k]=Character.toUpperCase(character[k]);
                        dc=false;
                    }
                }
                else{
                    dc=true;
                }
            }
            a=String.valueOf(character);
            System.out.println(a);
        }
    }
}
