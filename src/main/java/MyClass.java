public class MyClass {
    private String name;
    public MyClass(String name) {
        this.name = name;
        System.out.println("MyClass::Constructor();");
    }
    public void init() {
        System.out.println("MyClass::Init();");
    }
    @Override
    public String toString() {
        return "MyClass{" + name + '}';
    }
}
