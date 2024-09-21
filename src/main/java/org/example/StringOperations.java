package org.example;

public class StringOperations {

    public boolean checkImmutability (String str1, String str2){

            String s1=str1;
            String s2=str2;
        System.out.println("Hash code for s1"+s1.hashCode());
        System.out.println("Hash code for s1"+s2.hashCode());
            if( s1.hashCode() ==s2.hashCode()){
                System.out.println("Strings obj is same");
                 if(s1.equals(s2)){
                     System.out.println("Strings content is same");
                     return true;
                 }
            }
            else{
                System.out.println("String are Not equal");
            }
        return false;
    }

}
