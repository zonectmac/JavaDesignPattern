package abstractFactoryPattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green的fill方法");
    }
}
