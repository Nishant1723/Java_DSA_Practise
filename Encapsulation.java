package DSA;

public class Encapsulation {
    public static void main(String[] args) {
    name nam = new name();
    nam.setName("Nishant");
        System.out.println(nam.getName());
        nam.setName("Ni");
        System.out.println(nam.getName());
    }
}

class name {
    private String name;

//    getter method

    public String getName() {
        return name;
    }

//    setter method
    public void setName(String newName) {
        if(newName.length() > 2) {
            this.name = newName;
        } else {
            System.out.println("name must three letter long");
        }
    }
}
