
public class Passenger {

    public String Title(String t){
        String title = t;
        switch(title){
            case "Mr":
            case "Ms":
            case "Mrs":
                System.out.println("Your tittle: " + title);
                break;
            default:
                throw new IllegalArgumentException("Your title is not accepted please use Mr, Ms, Mrs");
        }
        return title;
        //implemnt method
    }
    public String Name(String n){
        String name = n;
        if(name.length()>3){
            System.out.println("Your Name: " + name);
        }
        else
            throw new IllegalArgumentException("Your Name is invalid must have more then 3 characters");
        return name;
    }

    public String ID(String x){
        String id = x;
        if(id.length()>9){
            System.out.println("ID is: "+ id);
        }
        else
            throw new IllegalArgumentException("Your ID is invalid must be more then 10 numbers");
        return id;
    }

    public String Phone(String y){
        String num = y;
        if(num.length()>6){
            System.out.println("Number is: "+ num);
        }
        else
            throw new IllegalArgumentException("Your number is invalid minimum number are 7");
        return num;
    }
    public int Age(int z){
        int age = z;
        if (age > 16){
            System.out.println("Age is: "+ age);
        }
        else
            throw new IllegalArgumentException("You must be over 16 to fly");
        return age;
    }
}