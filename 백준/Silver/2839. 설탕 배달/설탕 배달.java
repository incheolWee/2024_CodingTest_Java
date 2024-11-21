import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    System.out.println(Nsuger(N));

  }

  private static int Nsuger(int N) {
    if (N == 4 || N == 7) { // 해결 불가능 -1
      return -1;
    } else if (N % 5 == 0) { // 5로 나누어 지면 바로 리턴
      return N / 5;
    } else if (N % 5 == 1 || N % 5 == 3) { // 1과 3으로 나눠 떨어지면 3으로 나누기 가능
      return (N / 5) + 1;
    } else if (N % 5 == 2 || N % 5 == 4) {
      return (N / 5) + 2;
    }

    return -1;

  }
}
/*
 * 특수 case
 * 4,7은 해결할 수 없음 -1;
 * 
 * 1. N%5==1 => 3 또는 5와의 조합으로 해결 가능 => (N/5) +1
 * ex) 6/3 =2, 11=5+6 , 16=10+6 {3이라도 상관 X}
 * 2. N%5==2 => 3 또는 5와의 조합으로 해결 가능 => (N/5)+2
 * ex_ 12 = 3+3+3+3 , 17 = 12+5 , 22 = 12 +10 {3으로 12 만든뒤 5와 조합}
 * 3. N%5==3 => 3 또는 5와의 조합으로 해결 가능 => (N/5) +1
 * ex) 8 = 5+3 , 13 = 10 +3 , 18 = 15 +3 {3이라도 상관 X}
 * 4. N%5==4 => 3으로 9를 만들고 5와 조합 => (N/5)+2
 * ex) 14 = 3+3+3+5 , 19 = 10+9 , 24= 15 +9 {9=>3개, +5조합}
 * 5. N%5==5 => N/5 값 반환
 * ex) 5/5 =1, 10/5 =2
 */
