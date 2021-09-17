public class dz5 {

    public static void main(String[] args) {
        employee employee1 = new employee();
                employee[] employeeArr = new employee[5];
        employeeArr[0] = new employee(
                "Петров Петр Петрович",
                "Рабочий",
                "22@mail.ru",
                "+7(3412)11-11-11",
                25000,
                28);
        employeeArr[1] = new employee(
                "Васильев Василий Васильевич",
                "Слесарь",
                "33@mail.ru",
                "+7(3412)22-22-22",
                55000,
                39);
        employeeArr[2] = new employee(
                "Антонов Антон Антонович",
                "Экономист",
                "44@mail.ru",
                "+7(3412)33-33-33",
                30000,
                51);
        employeeArr[3] = new employee(
                "Александров Александр Александрович",
                "Начальник",
                "55@mail.ru",
                "+7(3412)44-44-44",
                100000,
                63);
        employeeArr[4] = new employee(
                "Федоров Федор Федорович",
                "Секретарь",
                "66@mail.ru",
                "+7(3412)55-55-55",
                31000,
                18);
        for (int i = 0; i < employeeArr.length; i++) {
            if(employeeArr[i].age > 40 ){
                employee.printInfo(
                        employeeArr[i].name,
                        employeeArr[i].position,
                        employeeArr[i].email,
                        employeeArr[i].telephone,
                        employeeArr[i].wage,
                        employeeArr[i].age);
            }
        }
    }
}