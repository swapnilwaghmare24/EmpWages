package Com.Bridgelabz.EmpWages;

public class EmployeeWages {

        private static final int IS_PRESENT = 1;
        private static final int IS_ABSENT = 0;
        public static void main(String[] args) {



            int empStatus = (int) (Math.random() * 10) % 2;
            switch (empStatus) {
                case IS_PRESENT:
                    System.out.println(empStatus + " Employee is present");
                    break;
                case IS_ABSENT:
                    System.out.println(empStatus + " Employee is absent");
                    break;
                default:
                    System.out.println("invalid input");
                }
            }
}
