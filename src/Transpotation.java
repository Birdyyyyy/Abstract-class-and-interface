//定义抽象类
public abstract class Transpotation {
    protected int ticket;
}

class Car extends Transpotation {
    protected int ticket = 500;
}

class Bus extends Transpotation {
    protected int ticket = 300;
}

class Train extends Transpotation {
    protected int ticket = 400;
}

class Plane extends Transpotation {
    protected int ticket = 1000;
}