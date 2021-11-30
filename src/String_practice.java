import java.util.Scanner;

public class String_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //아스키 코드  #11654
//        int a = sc.next().charAt(0);
//        System.out.println(a);

        //숫자의 합 #11720
//        int n = sc.nextInt();
//        String a = sc.next();
//        int sum = 0;
//
//        for(int i =0; i< n; i++){
//            sum += a.charAt(i)-'0';
//        }
//        System.out.println(sum);

        //알파벳 찾기 #10809
//        int[] arr = new int[26];
//        String a = sc.nextLine();
//
//        for(int i=0; i< arr.length; i++){
//            arr[i] = -1;
//        }
//
//        for(int j=0; j < a.length(); j++){
//            char cha = a.charAt(j);
//
//            if(arr[cha-'a'] == -1){
//                arr[cha-'a'] = j;
//            }
//        }
//        for(int val : arr){
//            System.out.println(val + " ");
//        }

        // 문자열 반복 #2675
//        int n = sc.nextInt();
//
//        for (int i=0; i <n; i++){
//
//            int num= sc.nextInt();
//            String s = sc.next();
//
//            for(int j =0; j< s.length(); j++){
//                for(int k =0; k < num; k++){
//                    System.out.print(s.charAt(j));
//                }
//            }
//            System.out.println();
//        }

        // 단어공부 #1157
//        int[] arr = new int[26];
//        String s = sc.next();
//
//        for (int i = 0; i < s.length(); i++){
//
//            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
//                arr[s.charAt(i) - 'A']++;
//            }
//
//            else {
//                arr[s.charAt(i) - 'a']++;
//            }
//        }
//        int max = -1;
//        char ch = '?';
//        for (int i = 0; i < 26; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                ch = (char) (i + 65);
//            }
//            else if (arr[i] == max) {
//                ch = '?';
//            }
//        }
//        System.out.print(ch);
//    }

        //단어의 개수 # 1152

//        String str = sc.nextLine().trim();
//
//        if(str.isEmpty()){
//            System.out.println("0");
//        } else{
//            System.out.println(str.split(" ").length);
//        }

        //상수 #2908

//        String reverse1 = new StringBuffer(sc.next()).reverse().toString();
//        String reverse2 = new StringBuffer(sc.next()).reverse().toString();
//
//        int reverint1 = Integer.parseInt(reverse1);
//        int reverint2 = Integer.parseInt(reverse2);
//
//        if (reverint1 <reverint2){
//            System.out.println(reverint2);
//        }else{
//            System.out.println(reverint1);
//        }

        //다이얼 #5622
//        String str = sc.nextLine();
//
//        int sec = 0;
//        int n = str.length();
//
//        for(int i = 0; i < n; i++) {
//
//            switch(str.charAt(i)) {
//                case 'A' : case 'B': case 'C' : sec += 3; break;
//                case 'D' : case 'E': case 'F' : sec += 4; break;
//                case 'G' : case 'H': case 'I' : sec += 5; break;
//                case 'J' : case 'K': case 'L' : sec += 6; break;
//                case 'M' : case 'N': case 'O' : sec += 7; break;
//                case 'P' : case 'Q': case 'R' : case 'S' : sec += 8; break;
//                case 'T' : case 'U': case 'V' : sec += 9; break;
//                case 'W' : case 'X': case 'Y' : case 'Z' : sec += 10; break;
//            }
//        }
//        System.out.print(sec);

        //크로아티아 알파벳 #2941


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



    }
}






















