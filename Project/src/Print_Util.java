import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Print_Util {
   private static Scanner sc = new Scanner(System.in);
   private static int day = 0;
   private static int day1 = 0;
   private static int day2 = 0;
   private static Calendar firstDate = null;
   public static List<Airplane> airplane= new ArrayList<Airplane>();
   public static void clearScreen() {
      for (int i = 0; i < 80; i++)
         System.out.println("");
   }
   public static Airplane selectInfo(String select) {
      System.out.println("[좌석선택]");
      System.out.println("1.비즈니스석 가격 : "+
            Print_Util.airplane.get(Integer.parseInt(select)-1).getBusinessPrice() +"\n2.이코노미석 가격 : "
         +  Print_Util.airplane.get(Integer.parseInt(select)-1).getEconomyPrice()+"");
      return Print_Util.airplane.get(Integer.parseInt(select)-1);
   }
   public static void routeList() {
      FlightInfo flightInfo = new FlightInfo();
      System.out.println();
      for(int i = 0 ; i < flightInfo.ar.size() ; i++) {
         System.out.println(flightInfo.ar.get(i));
      }
   }
   public static void toPath(String toDate, String path) {
      FlightInfo fi= new FlightInfo();
      int count = 0;
      for(int i = 0 ; i < fi.ar.size() ; i++) {
         
         if(fi.ar.get(i).getDate().equals(toDate) && fi.ar.get(i).getPath().equals(path)) {
            System.out.printf("%d.[출발날짜 : %s],[출발시간 : %s]\n" 
                  ,count+1,fi.ar.get(i).getDate(),
                  fi.ar.get(i).getTime(),
                  fi.ar.get(i).getBusinessPrice(),
                  fi.ar.get(i).getEconomyPrice());
            airplane.add(fi.ar.get(i));
            count++;
         }
      }
      System.out.println("예매하실 비행편을 선택해주세요.");
   }
   public static boolean seatGrade() {
      while(true) {
         String select = sc.nextLine();
         
         Airplane air = Print_Util.selectInfo(select);
         int sselect = Integer.parseInt(sc.nextLine());
         if( sselect == 1) {
            if(Member.balance > air.getBusinessPrice()) {
               air.business();
               return true;
            }else{
               System.out.println("잔액이 부족합니다.");
               return false;
            }
         }else if (sselect == 2) {
            if(Member.balance > air.getBusinessPrice()) {
               air.economy();
               return true;
               }else{
               System.out.println("잔액이 부족합니다.");
               return false;
            }
         }
         else {
            System.out.println("잘못된 번호입니다.");
            }
         }
   
   }
   public static boolean ManagerMenuPassword() {
      System.out.println("암호를 입력하세요.");
      String managerPwd = sc.nextLine();
      return managerPwd.equals("0000");
   }
   public static void showRoute() {
      System.out.println("1. 인천 - 도쿄");
      System.out.println("2. 인천 - 파리");
      System.out.println("3. 인천 - 토론토");
      System.out.println("4. 인천 - 런던");
      System.out.println("5. 도쿄 - 인천");
      System.out.println("6. 파리 - 인천");
      System.out.println("7. 토론토 - 인천");
      System.out.println("8. 런던 - 인천");
   }
   public static void showManagerMenu() {
      System.out.println("관리자 메뉴");
      System.out.println("1.전체일정확인");
      System.out.println("2.회원목록보기");
      System.out.println("0.메인메뉴로 돌아가기");
   }
   public static void showMenu() {
      System.out.println("노진에어 좌석 예약 프로그램");
      System.out.println("1. 회원가입");
      System.out.println("2. 로그인");
      System.out.println("3. 종료");
   }
   public static void logIn() {
      File f = null;
      FileInputStream fr = null;
      BufferedInputStream br = null;
      ObjectInputStream ois = null;
      System.out.println("**로그인**");
      System.out.println("여권번호 : ");
      String passportNum = sc.nextLine();
      System.out.println("비밀번호 : ");
      String pwd = sc.nextLine();

      Member users = null;

      try {
         f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

         if (f.exists()) { // 파일이 만약에 존재할 경우
            fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
            br = new BufferedInputStream(fr);
            ois = new ObjectInputStream(br);
            users = (Member) ois.readObject();
            if (users.getPwd().equals(pwd)) {
               System.out.println("로그인 중입니다.");
            } else {
               System.out.println("비밀번호를 다시 입력해주세요.");
               logIn();
            }
         } else {
            System.out.println("여권번호가 일치하지 않습니다.");
            logIn();
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            ois.close();
            br.close();
            fr.close();
         } catch (Exception e) {

         }
      }
   }
   public static void transactionList() {
      System.out.println("목적지             결제날짜        결제시간         출발날짜                   출발시간       티켓가격              남은잔액");
      for(int i = 0 ; i < Airplane.transaction.size() ; i++) {
         System.out.println(Airplane.transaction.get(i).routeinfo+"        "
                           +Airplane.transaction.get(i).payDate+" "
                           +Airplane.transaction.get(i).payTime+"   "
                           +Airplane.transaction.get(i).flightDate+"       "
                           +Airplane.transaction.get(i).flightTime+"    "
                           +Airplane.transaction.get(i).amount+"    "
                           +(Airplane.transaction.get(i).balance-Airplane.transaction.get(i).amount));
      }
      
   }
   public static void transactionListCancle() {
      int count = 0;
      int select = 0;
      

      System.out.println("       목적지            결제날짜           결제시간          출발날짜          출발시간         티켓가격               남은잔액");
      for(int i = 0 ; i < Airplane.transaction.size() ; i++) {
         
         System.out.println((count+1)+". "+Airplane.transaction.get(i).routeinfo+"       "
                           +Airplane.transaction.get(i).payDate+" "
                           +Airplane.transaction.get(i).payTime+"    "
                           +Airplane.transaction.get(i).flightDate+"      "
                           +Airplane.transaction.get(i).flightTime+"     "
                           +Airplane.transaction.get(i).amount+"      "
                           +(Airplane.transaction.get(i).balance-Airplane.transaction.get(i).amount));
         count++;
      }
      System.out.println("\n취소할 번호를 입력하세요.");
      select = Integer.parseInt(sc.nextLine());
      long amount = Airplane.transaction.get(select-1).amount;
      Member.balance += amount; 
      Airplane.transaction.remove(select-1);
   }
   public static void logInMenu() {
      System.out.println("1. 예매하기");
      System.out.println("2. 예매확인");
      System.out.println("3. 예매취소");
      System.out.println("4. 요금충전");
      System.out.println("5. 요금확인");
      System.out.println("6. 로그아웃");
      System.out.println("7. 종료");
   }
   public static void checkBalance() {
      System.out.println("현재 잔액 : "+Member.balance);
   }
   public static void addBalance() {
      System.out.println("추가할 금액을 입력하세요.");
      Member.balance += Long.parseLong(sc.nextLine());
      System.out.println("요금이 충전되었습니다.");
   }
   public static Member signIn() {
      String form;
      String name, passportNum, cardInfo, pwd, phoneNum;
      System.out.println("회원가입 *********");
      while (true) {
         System.out.println("이름         : ");
         name = sc.nextLine();
         form = "^[가-힣]{2,4}+$";
         if (!Pattern.matches(form, name)) {
            System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
         } else {
            break;
         }
      }
      while (true) {
      System.out.println("여권번호\t: ");
      passportNum = sc.nextLine();
      form = "([a-zA-Z]{1})\\d{8}";

      while (true) {
         File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
         if (f.exists()) {
            System.out.println("존재하는 여권번호입니다. 다시 입력해주세요");
            System.out.println("여권번호\t: ");
            passportNum = sc.nextLine();
            form = "([a-zA-Z]{1})\\d{8}";
         } else {
            break;
         }
      }
      if (!Pattern.matches(form, passportNum)) {
         System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
      } else {
         break;
      }

   }

      
      while (true) {
         System.out.println("핸드폰번호(ex.010-0000-0000) : ");
         phoneNum = sc.nextLine();
         form = "^(010)-\\d{4}-\\d{4}$";
         if (!Pattern.matches(form, phoneNum)) {
            if (!phoneNum.contains("-")) {
               System.out.println("하이픈을 넣어 다시 입력하세요.");
            } else {
               System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
            }
         } else {
            break;
         }
      }
      while (true) {
         System.out.println("카드번호(ex.0000-1111-2222-3333)\t : ");
         cardInfo = sc.nextLine();
         form = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
         if (!Pattern.matches(form, cardInfo)) {
            if (!cardInfo.contains("-")) {
               System.out.println("하이픈을 넣어 다시 입력하세요.");
            } else {
               System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
            }
         } else {
            break;
         }
      }
      while (true) {
         System.out.println("비밀번호\t : (ex. 영어+숫자 8~16글자)");
         pwd = sc.nextLine();
         form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
         if (!Pattern.matches(form, pwd)) {
            System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
         } else {
            break;
         }
      }

      String pathDirectory = "C:\\Temp\\Members";
      File Folder = new File(pathDirectory);
      if (!Folder.exists()) {
         try {
            Folder.mkdir();
            System.out.println("Members 폴더가 생성되었습니다.");
         } catch (Exception e) {
            e.getStackTrace();
         }
      }

      Member m = new Member(name, phoneNum, cardInfo, passportNum, pwd, 0);

      try {
         String pathFile = "C:\\Temp\\Members\\" + passportNum + ".txt";
         File file = new File(pathFile);
         FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(m);
         oos.close();
         fos.close();
         System.out.println("회원가입이 완료되었습니다.");

      } catch (Exception e) {
         System.out.println("에러발생!!!");
         e.printStackTrace();
      }

      enter();
      return m;

   }
   public static void enter() {
      System.out.println("아무키나 입력하시면 메인화면으로 돌아갑니다.");
      sc.nextLine();
   }
   public static String checkDate() {
      GregorianCalendar today = new GregorianCalendar();
      int year = today.get(today.YEAR);
      int month = today.get(today.MONTH) + 1;
      int day = today.get(today.DAY_OF_MONTH);
      
      Calendar toDay = Calendar.getInstance();
      Calendar today2 = Calendar.getInstance();
      toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
      today2.set(year, month, day);
      firstDate = toDay;

      
      return today2.compareTo(toDay) == -1 || today2.compareTo(toDay )==0 ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day1 : "오늘이나 오늘 이후날짜를 선택해주세요.";
   }
   public static String checkDate2(String toDate) {
      GregorianCalendar today = new GregorianCalendar();
      int year = today.get(today.YEAR);
      int month = today.get(today.MONTH) + 1;
      int day = today.get(today.DAY_OF_MONTH);
      
      Calendar toDay = Calendar.getInstance();
      Calendar fromDay = Calendar.getInstance();
      Calendar today2 = Calendar.getInstance();
      toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
      today2.set(year, month, day);
      System.out.println("[출발날짜 : " + toDate + "] ,"
            +                "[도착날짜 : " + Calendar2.year +"/"+Calendar2.month+"/"+ Print_Util.day2 + "]");
      return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0  ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day2: "출발날짜나 출발날짜 이후날짜를 선택해주세요.";
   }
   public static void showCal() {
      Calendar2.input();
       Calendar2.output(Calendar2.year, Calendar2.month);
       while(true) {
          System.out.println("예매할 날짜의 일을 입력하세요.");
          day1 = Integer.parseInt(sc.nextLine());
          if(day1 >= 1 && day1 <= 31) {
             break;
          }else {
             System.out.println("잘못된 날짜입니다.");
          }
       }   
   }
   public static int inputDay() {
      int day = Integer.parseInt(sc.nextLine());
      return day;
   }
   public static void showCal2() {
      Calendar2.input();
       Calendar2.output(Calendar2.year, Calendar2.month);
       while(true) {
          System.out.println("예매할 날짜의 일을 입력하세요.");
          while(true) {
             day2 = inputDay();
             if(day2 >= day1) {
                break;
             }
             System.out.println("출발날짜 혹은 출발날짜 이후 날짜를 선택해주세요.");
          }
          if(day2 >= 1 && day2 <= 31) {
             break;
          }else {
             System.out.println("잘못된 날짜입니다.");
          }
       }   
   }
   
   public static void MemberList() {
      File f = null;
      String name = null;
      int count = 0;


      FileInputStream fs = null;
      BufferedInputStream bis = null;
      ObjectInputStream ois = null;

      String path = "C:\\Temp\\Members\\";
      String line = "";
      Member users = null;
      try {
         f = new File(path);
         File[] files = f.listFiles(); // files에는 파일과 디렉터리가 들어있음
         System.out.println("   회원이름");
         
         for (int i = 0; i < files.length; i++) {

            String name2 = files[i].getName();
            fs = new FileInputStream(path + name2);
            bis = new BufferedInputStream(fs);
            ois = new ObjectInputStream(bis);
            count++;
            users = (Member) ois.readObject();
            System.out.println(count+". ["+users.getName()+"]");
         }
         System.out.printf("총 회원 수는 %d명입니다.\n",count);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      } finally {
         try {
            ois.close();
            bis.close();
            fs.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}