package day28_ArrayList;



public class StrongPassword1 {
    public static void main(String[] args) {
        String password="OHLjan818!";// must be 8 character long no space has lower case upper case digit and specail char
        int countUpperCase=0;
        int countLowerCase=0;
        int countDigit=0;
        int countSpecialChar=0;
        for (int i = 0; i <password.length() ; i++) {
            char each=password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;// if it s uppercase will add by one
            }else if (Character.isLowerCase(each)){
                countLowerCase++;// increase by one
            }else if (Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecialChar++;
            }
        }
      /*  System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countSpecialChar = " + countSpecialChar);  */
// since we did not get the number of upper or lower case number , only need to confirme if it s a strong password or not

        boolean hasUpperCase=countUpperCase>0;
        boolean hasLowerCase=countLowerCase>0;
        boolean hasDigit=countDigit>0;
        boolean hasSpecialChar =countSpecialChar >0;
        boolean strongPassword=password.length()>=8 && !password.contains(" ")
                && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("strongPassword = " + strongPassword);


        boolean strongPassword1=false;
        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialChar){
                            strongPassword1=true;
                            }
                        }
                    }
                }
            }
        }
    }
}
