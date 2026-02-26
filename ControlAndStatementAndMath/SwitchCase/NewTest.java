package ControlAndStatementAndMath.SwitchCase;

import java.util.Scanner;

public class NewTest {
public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.println("Welcome in Java ");

    System.out.println("Enter Your Day ");
    int day = input.nextInt();

    String dayStr = switch(day){
        case 1 -> "Monday";
          case 2 -> "Tuesday";
            case 3 -> "Wednesday";
              case 4 -> "Thrusday";
                case 5 -> "Friday";
                  case 6 -> "Saturday";
                    case 7 -> "Sunday";
                      default -> "Invalid ";

    };
    System.out.println(dayStr);
}
}
