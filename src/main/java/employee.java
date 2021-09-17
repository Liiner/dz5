public class employee {
    public String name;
    public String position;
    public String email;
    public String telephone;
    int wage;
    public int age;

public employee(){
        System.out.print( "ФИО,");
        System.out.print( "Должность,");
        System.out.print( "Email,");
        System.out.print( "Телефон,");
        System.out.print( "Ставка,");
        System.out.print( "Возраст,");
        System.out.println();
}

    public employee(String name, String position, String email, String telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
            }

    public static void printInfo(String name, String position, String email, String telephone, int wage, int age) {

        System.out.print(name + ",");
        System.out.print(position + ",");
        System.out.print(email + ",");
        System.out.print(telephone + ",");
        System.out.print(wage + ",");
        System.out.print(age + ",");
        System.out.println();
    }
}

