import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.Array;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;


public class person {


    public static void main(String[] args) {

//        System.out.println("enter a number");
//        Scanner scan = new Scanner(System.in);
//
//                int inPut = scan.nextInt();
//        System.out.println("bu sayiyi yazdirdiniz " + inPut );
//
//


        System.out.println(price1());


    }



///-------------------

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here


        while (true) {
            int distance = x2 - x1;
            x1 = x1 + v1;
            x2 = x2 + v2;

            if (x1 == x2) {
                return "YES";
            } else if (distance < (x2 - x1)) {
                return "NO";
            }

        }

    }

//-------------------------
    public static int pageCount(int n, int p) {
        // Write your code here

        int front = 0;
        int back = 0;
        int page = 1;
        while (page <= n) {
            if (page >= p) {
                break;
            } else {
                front++;
            }
            if (n - page == 1) {
                page++;
            } else {
                page += 2;
            }
        }
        if (n % 2 == 0) {
            page = n;
        } else {
            page = n - 1;
        }
        while (page >= 0) {
            if (page <= p) {
                break;
            } else {
                back++;
            }
            page -= 2;

        }
        return (Math.min(front, back));

    }


    Scanner scan = new Scanner(System.in);
    int newInt = scan.nextInt();
    String newString = scan.nextLine();

//-------------------------------

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

int highScore = scores.get(0);
int  lowestScore = scores.get(0);
int first =0;
int sec = 0;

for (int i=1; i<scores.size();i++) {
    if (highScore < scores.get(i)) {
        highScore=scores.get(i);
first++;}
    else if (lowestScore>scores.get(i)) {
        lowestScore=scores.get(i);
        sec++;
        }
}
        List<Integer> newScore = new ArrayList<Integer>();
newScore.add(first) ;
newScore.add(sec);

       return newScore;

    }


//---------------
public static int countingValleys(int steps, String path) {
    // Write your code here


int valley = 0;
int level=0;
 String[] newPath = new String[path.length()];
newPath = path.split("");

        for(int  i = 0; i<steps;i++) {

            if(newPath[i].equals("D")) {
                level--;
            }
             if ( newPath[i].equals("U")){
                level++;
            }  if (level==0 && newPath[i].equals("U") ) {
                valley++;
            }

        }

return valley;



}




    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
int totalPrice=0;
//int SecPrice=0;
for(int key = 0;key<keyboards.length;key++) {
    for (int dri=0;dri<drives.length;dri++) {
       if( totalPrice<keyboards[key]+drives[dri]){
           if(totalPrice<=b) {

          totalPrice=keyboards[key]+drives[dri];
       }
       }
       }
  }

        if(totalPrice==0){
            return -1;
        }
        else {
            return totalPrice;
        }

    }






//-----------------------------



    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> newScore1= new ArrayList<>();


        for(int i=0;i<player.size();i++) {
            int score= 0;
            for (int j=0;j<ranked.size();j++) {
                if (player.get(i)<=ranked.get(j) ) {
                    score++;

                    if (ranked.get(j)== ranked.get(j-1)) {
                        score--;
                    }
                }
                newScore.add(score);
           }

        }
        System.out.println(newScore1.get(10));
    }








    //------------------






public static int price1 () {

    System.out.println("bir tutar giriniz");
    double km = scan.nextInt();

    double price= 10+ (km *1.20);

    if (price<20) {
        return "odenecek tutar 20 TL";
    }
    else {
        return price;
    }


}




//---------------------------------







    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) {
                count++;
            }
        }

        if (count >= k) {
            return "NO";
        } else {
            return "YES";
        }
    }




//-------------------------------

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here

        int doses =-1;


        for (int i=0;i<height.size();i++) {
            if (doses < height.get(i)) {
                doses = height.get(i);
            }
        }
        if (doses > k) {
            return (doses-k);
        }
        else  {
            return 0;
        }
    }

















}
























