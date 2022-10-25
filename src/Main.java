import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        List<Person> client = generateClients();
        for (Person person : client) {
            queue.offer(person);
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель: " + person.getName() + person.getSurname()
                    + person.getTickets() + " прокатился на аттракционе");
            person.spendOneTicket();
            if (person.hasMoreTickets()) {
                queue.offer((person));
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Olya ", "Ivanova ", 5));
        list.add(new Person("Lena ", "Smirnova ", 3));
        list.add(new Person("Natasha ", "Petrova ", 4));
        list.add(new Person("Vera ", "Sergeeva ", 2));
        list.add(new Person("Oleg ", "Alekseev ", 1));
        return list;

    }
}