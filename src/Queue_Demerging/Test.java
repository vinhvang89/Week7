package Queue_Demerging;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final boolean MALE = true;
        final boolean FEMALE = false;
        QueueList female = new QueueList(5);
        QueueList male = new QueueList(5);
        QueueList output = new QueueList(10);

        Employee employee1 = new Employee("Linda",31,FEMALE);
        Employee employee2 = new Employee("Charlotte",22,FEMALE);
        Employee employee3 = new Employee("Bobby",51,MALE);
        Employee employee4 = new Employee("Alex",35,MALE);
        Employee employee5 = new Employee("Helen",19,FEMALE);
        Employee employee6 = new Employee("Lucifer",2050,MALE);
        Employee[] employees = {employee1,employee2,employee3,employee4,employee5,employee6};
        for (Employee employee : employees) {
            if (employee.isGender())
                male.enqueue(employee);
            else
                female.enqueue(employee);

        }
        male.sortByAge();
        female.sortByAge();
        female.dequeue(output);
        female.dequeue(output);
        female.dequeue(output);
        male.dequeue(output);
        male.dequeue(output);
        male.dequeue(output);
        System.out.println(Arrays.toString(output.getArray()));
        System.out.println(Arrays.toString(male.getArray()));
        System.out.println(Arrays.toString(female.getArray()));
    }
}
