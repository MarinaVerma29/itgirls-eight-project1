package in.varma.app8.bubblesort;

public class Main {
    public static void main(String[] args) {
        Student[] students ={
                new Student("Иванов", 4.5),
                new Student("Петров", 3.7),
                new Student("Сидоров", 4.2),
                new Student("Козлов", 5),
                new Student("Смирнов", 3.9)
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = i; j < students.length; j++) {
                if (students[i].getAverageMark() < students[j].getAverageMark()){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getSurname() + " " + students[i].getAverageMark());
        }
    }

}
