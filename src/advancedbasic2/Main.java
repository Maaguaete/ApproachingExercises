package advancedbasic2;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Numbers of vehicles: ");
        int N = sc.nextInt();
        Vehicles[] vehicles = new Vehicles[N];
        boolean stop = true;
        int choice;
        do {
            System.out.print("""
                    Option:
                    1. Input information for vehicles.
                    2. Display information including tax of vehicles.
                    3. Exit.
                    \s""");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    for (int i = 0; i < N; i++) {
                        vehicles[i] = new Vehicles();
                        System.out.println("Input Information of Vehicle " + (i + 1) + "! ");
                        System.out.print("Serial number: ");
                        vehicles[i].setSerial(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Owner: ");
                        vehicles[i].setOwner(sc.nextLine());
                        System.out.print("Description: ");
                        vehicles[i].setDescribe(sc.nextLine());
                        System.out.print("Price: ");
                        vehicles[i].setPrice(sc.nextDouble());
                        sc.nextLine();
                        System.out.print("Engine Capacity: ");
                        vehicles[i].setEngineCap(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.printf("%-5s %10s %18s %10s %20s %10s\n",
                            "Serial number", "Owner", "Description", "Price","Engine Capacity", "Tax Fee");
                    for(int i=0; i<N; i++){
                        vehicles[i].displayTax();
                    }
                    break;
                default:
                    System.out.print("Shutting down!");
                    stop = false;
                    break;
            }
        }while (stop);
    }
}
