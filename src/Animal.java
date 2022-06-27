
public abstract class Animal{
    public abstract float price();
}

class Hen extends Animal{
    public float price() {
        return 3;
    }
}

class Cock extends Animal{
    public float price() {
        return 5;
    }
}

class Chicken extends Animal{
    public float price() {
        return (float)1/3;
    }
}
