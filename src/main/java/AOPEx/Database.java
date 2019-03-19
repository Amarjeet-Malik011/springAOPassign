package AOPEx;

import org.springframework.stereotype.Component;

@Component
class Database {
    private int port;
    private String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean connect(){
        return true;
    }

    public void display(){
        System.out.println("Dummy class display method");
    }
    public Integer getInteger(){
        System.out.println("Dummy class integer method");
        return 1234;
    }
    public void throwException(){
        System.out.println("throwing Exception");
        throw new RuntimeException();
    }
    public void aroundMethodTest(){
        System.out.println("aroundMethodTest() invoke");
    }
}
