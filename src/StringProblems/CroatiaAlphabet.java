package StringProblems;

import java.util.Scanner;

public class CroatiaAlphabet {
    public static void main(String[] args) {

//        크로아티아 알파벳 #2941

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ct = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'c') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        i++;
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            else if(ch == 'd') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2) {
                            if(str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                               i++;
                    }
                }
            }
            else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            ct++;
        }
        System.out.println(ct);
    }
}






















