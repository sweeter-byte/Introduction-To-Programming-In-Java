package Lect5;

public class ScopeReview {
    private int var3;
    void scopeMethod(int var1) {
        var3 = var1;
        String var2;
        if (var1 > 0) {
            var2 = "above 0";
        } else {
            var2 = "less than or equal to 0";
        }
        System.out.println(var2);
        System.out.println(var3);
    }

    public static void main(String[] args) {
        ScopeReview test = new ScopeReview();
        test.scopeMethod(5);
    }
}

/*
 * Packages
 * Each class belongs to package
 * Classes in the same package serve a similar purpose
 * Packages are just directories
 * Classes in other packages need to be imported
 * 
 * Defining Packages:
 * pakeage path.to.package.foo;
 * class Foo{}
 * 
 * Using Packages
 * import path.to.package.foo.Foo;
 * import path.to.package.foo.*;
 * 
 * Special:
 * All classes "see" classes in the same package (no import needed)
 * All classes "see" classes in java.lang
 */
