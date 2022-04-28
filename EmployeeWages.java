package Com.Bridgelabz.EmpWages;

public class EmployeeWages {


        private static final int IS_PRESENT = 1;
        private static final int IS_ABSENT = 0;
        private static final int WAGE_PER_HOUR=20;
        private static final int DAY_HOUR=8;

        public static void main(String[] args) {
            int dailyWage=0;
            int empStatus = (int) (Math.random() * 10) % 2;
            switch (empStatus) {
                case IS_PRESENT:
                    System.out.println(empStatus + " Employee is present");
                    dailyWage = WAGE_PER_HOUR*DAY_HOUR;
                    break;
                case IS_ABSENT:
                    System.out.println(empStatus + " Employee is absent");
                    break;
                default:
                    System.out.println("invalid input");
                }
                System.out.println("Per day wages = "+dailyWage);
            }
}
