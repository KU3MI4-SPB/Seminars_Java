import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

       while (true) {
           id.add(gender.size());

           System.out.println("Введите ФИО или end для выхода: ");
           String fullName = sc.nextLine();
           if (fullName.equalsIgnoreCase("end")) break;
           people.add(fullName);
           System.out.println("Введите возраст: ");
           String age1 = sc.nextLine();
           age.add(Integer.parseInt(age1));
           System.out.println("Выберите пол: ");
           //        boolean gender = sc.nextBoolean();
           String gender1 = sc.nextLine();
           gender.add(gender1.toLowerCase().contains("м")?false:true);


//           people.add(new String[] {fullName, age, gender});


       }
       sc.close();


//       people.forEach(el -> System.out.println(Arrays.toString(el)));
       System.out.println("---------------".repeat(10));

    //    people.sort((o1, o2) -> Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]));
    //     people.forEach(el -> System.out.println(Arrays.toString(el)));




    }
}