public class control {
    public static void main(String[] args) {
        
        // ===== IF STATEMENT =====
        System.out.println("===== IF STATEMENT =====");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        
        
        // ===== IF-ELSE STATEMENT =====
        System.out.println("\n===== IF-ELSE STATEMENT =====");
        int score = 45;
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        
        // ===== IF-ELSE IF STATEMENT =====
        System.out.println("\n===== IF-ELSE IF STATEMENT =====");
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        
        // ===== SWITCH STATEMENT =====
        System.out.println("\n===== SWITCH STATEMENT =====");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        
        // ===== FOR LOOP =====
        System.out.println("\n===== FOR LOOP =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        
        // ===== MULTIPLICATION TABLE (FOR LOOP) =====
        System.out.println("\n===== MULTIPLICATION TABLE (FOR LOOP) =====");
        int table = 5;
        System.out.println("Multiplication Table of " + table);
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
        
        
        // ===== FOR-EACH LOOP =====
        System.out.println("\n===== FOR-EACH LOOP =====");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        
        // ===== WHILE LOOP =====
        System.out.println("\n===== WHILE LOOP =====");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        
        // ===== DO-WHILE LOOP =====
        System.out.println("\n===== DO-WHILE LOOP =====");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        
        
        // ===== BREAK STATEMENT =====
        System.out.println("\n===== BREAK STATEMENT =====");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // Exits the loop
            }
            System.out.println("i = " + i);
        }
        
        
        // ===== CONTINUE STATEMENT =====
        System.out.println("\n===== CONTINUE STATEMENT =====");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the rest of the iteration
            }
            System.out.println("i = " + i);
        }
        
        
        // ===== NESTED IF =====
        System.out.println("\n===== NESTED IF =====");
        int a = 15;
        int b = 10;
        if (a > 10) {
            System.out.println("a is greater than 10");
            if (b > 5) {
                System.out.println("b is also greater than 5");
            }
        }
        
        
        // ===== NESTED LOOPS =====
        System.out.println("\n===== NESTED LOOPS =====");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "-" + j + " ");
            }
            System.out.println();
        }
        
        
        // ===== TERNARY OPERATOR =====
        System.out.println("\n===== TERNARY OPERATOR =====");
        int x = 20;
        String result = (x > 15) ? "x is greater than 15" : "x is not greater than 15";
        System.out.println(result);
        
        
        // ===== BREAK IN NESTED LOOP =====
        System.out.println("\n===== BREAK IN NESTED LOOP =====");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop at i=" + i + ", j=" + j);
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
