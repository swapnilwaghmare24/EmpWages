package Com.Bridgelabz.EmpWages;

public class EmployeeWages {


    private static final int IS_PRESENT = 1;
    private static final int IS_ABSENT = 0;
    private static final int WAGE_PER_HOUR = 20;
    private static final int DAY_HOUR = 10;
    private static final int PART_TIME = 5;


    public static void main(String[] args) {
        int dailyWage = 0;
        int dayCount = 0;
        int totalTime = 0;
        int monthlyWage = 0;
        while (dayCount < 20 && totalTime < 100) {
            dayCount++;
            int empStatus = (int) (Math.random() * 10) % 2;
            int time = (int) (Math.random() * 10) % 2;
            switch (empStatus) {
                case IS_PRESENT:
                    System.out.println(empStatus + " Employee is present");
                    if (time == PART_TIME) {
                        totalTime = totalTime + PART_TIME;
                        dailyWage = WAGE_PER_HOUR * PART_TIME;
                    } else {
                        totalTime = totalTime + DAY_HOUR;
                        dailyWage = WAGE_PER_HOUR * DAY_HOUR;
                    }
                    break;
                case IS_ABSENT:
                    System.out.println(empStatus + " Employee is absent");
                    break;
                default:
                    System.out.println("invalid input");
            }

            monthlyWage = monthlyWage + dailyWage;
        }
            System.out.println("monthly wages = " + monthlyWage);
        System.out.println("Total time "+totalTime);
        System.out.println("Total day "+dayCount);



    }
}