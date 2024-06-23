package ferdyfermadi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PSBB {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input the number of families: ");
            int familyCount = Integer.parseInt(scanner.nextLine());

            System.out.print("Input the number of members in the family (separated by a space): ");
            String[] membersInput = scanner.nextLine().split(" ");
            int[] members = new int[membersInput.length];

            for (int i = 0; i < membersInput.length; i++) {
                members[i] = Integer.parseInt(membersInput[i]);
            }

            if (familyCount != members.length) {
                System.out.println("Input must be equal with count of family");
                return;
            }

            int car = 0;
            List<Integer> memberList = new ArrayList<>();

            for (int member : members) {
                memberList.add(member);
            }

            // sorting data array
            Collections.sort(memberList, Collections.reverseOrder());

            // fulfill bus
            int i = 0;
            while (i < memberList.size()) {
                if (memberList.get(i) == 4) {
                    car++;
                    i++;
                } else {
                    boolean found = false;
                    for (int j = i + 1; j < memberList.size(); j++) {
                        if (memberList.get(i) + memberList.get(j) <= 4) {
                            car++;
                            memberList.remove(j);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        car++;
                    }
                    i++;
                }
            }
            System.out.println("Minimum bus required is : " + car);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

