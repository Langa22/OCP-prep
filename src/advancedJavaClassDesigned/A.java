package advancedJavaClassDesigned;
@FunctionalInterface
public interface A extends B{

}
@FunctionalInterface
interface B<T>{
    public void print(T t);
}

interface C<T> extends A,B{
    public void printer(T t);
}