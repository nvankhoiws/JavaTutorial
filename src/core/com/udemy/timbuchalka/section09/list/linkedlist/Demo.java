package core.com.udemy.timbuchalka.section09.list.linkedlist;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> enqueue = new LinkedList();
        addInOrder(enqueue, "Khoi1");
        addInOrder(enqueue, "Khoi2");
        addInOrder(enqueue, "Khoi3");
        addInOrder(enqueue, "Khoi4");
        addInOrder(enqueue, "Khoi5");
        addInOrder(enqueue, "Khoi7");

        printList(enqueue);

        addInOrder(enqueue, "Khoi6");

        printList(enqueue);

        visitQueue(enqueue);
    }

    private static void visitQueue(LinkedList<String> enqueue) {
        Scanner scanner = new Scanner(System.in);
        ListIterator listIterator = enqueue.listIterator();

        printQueueOption();

        boolean quit = false;

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    // quit the visit
                    System.out.println("Stop audit the queue.");
                    quit = true;
                    break;
                case 1:
                    // going forward
                    if (listIterator.hasNext()) {
                        System.out.println("Now auditting " + listIterator.next());
                    } else {
                        System.out.println("End of the queue");
                    }
                    break;
                case 2:
                    // going backward
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now auditting " + listIterator.previous());
                    } else {
                        System.out.println("Start of the queue");
                    }
                    break;
                case 3:
                    // print queue option
                    printQueueOption();
                    break;
                default:
                    // quit the visit
                    System.out.println("Stop audit the queue.");
                    quit = true;
                    break;
            }
        }

    }

    private static void printQueueOption() {
        System.out.println("0- quit the visit\n+" +
                            "1- going forward in queue\n"+
                            "2- going backward in queue\n"+
                            "3- print queue option");
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator iterator = placesToVisit.iterator();
        while (iterator.hasNext()){
            System.out.println("now visiting " + iterator.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> queue, String newpeople) {
        ListIterator<String> iterator = queue.listIterator();
        while(iterator.hasNext()){
            int comparision = newpeople.compareTo(iterator.next());
            if (comparision < 0){
                iterator.previous();
                iterator.add(newpeople);
                return true;
            } else if (comparision == 0){
                System.out.println("The person is already in the list.");
                return false;
            } else {
                continue;
            }
        }
        iterator.add(newpeople);
        return true;
    }
}
