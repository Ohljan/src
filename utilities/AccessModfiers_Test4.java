package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModfiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
     //   System.out.println(AccessModfiers_Test4.name1); since name 1 was defaut access modifier so can not be used outside of package
        System.out.println(AccessModfiers_Test4.name2);// name2 was a protected so can be used in the subclass;
       // AccessModfiers_Test4.method1();
        AccessModfiers_Test4.method2();

    }
}
