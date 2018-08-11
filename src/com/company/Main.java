package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringDelete("at","cat"));
        System.out.println(stringDelete("boat","got"));
       System.out.println(stringDelete("oughth","th"));
    }

    public static int stringDelete(String a, String b){
        int result =0;

        result = helperFunction(a,b)+ helperFunction(b,a);
        System.out.println("");
      return result;
    }


public static int helperFunction(String a, String b){

        String add ="";
        int result =0;
        int count =0;
        for(int n = 0; n < b.length(); n++){
            for(int m = 0; m < a.length(); m++){

                if(a.charAt(m) == b.charAt(n)){
                    count =1;
                    break;
                }
                else{
                    count =0;
                }
            }
            if(count == 0){
                add = add + b.charAt(n);
            }
        }

        System.out.print(add);

        for(char c : add.toCharArray()){
            result += (int) c;
        }
        return result;
    }
}


