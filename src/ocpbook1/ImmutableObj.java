package ocpbook1;

public class ImmutableObj {
    public static void main(String[] args) {
        String str1=new String("Content");
        String str2=new String("Content");
        System.out.println("str1==str2 is "+(str1==str2));
        System.out.println("str1.intern()==str2.intern() is "+(str1.intern()==str2.intern()));
    }
}
