// class Solution {
//     public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//         int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//         int bobArrival = Integer.valueOf(arriveBob.substring(0 , 2) + arriveBob.substring(3));
//         int aliceLeave = Integer.valueOf(leaveAlice.substring(0 , 2) + leaveAlice.substring(3));
//         int aliceArrival = Integer.valueOf(arriveAlice.substring(0 , 2) + arriveAlice.substring(3));
//         int bobLeave = Integer.valueOf(leaveBob.substring(0 , 2) + leaveBob.substring(3));
//         if(bobArrival > aliceLeave || bobLeave < aliceLeave){
//             return 0;
//         }
//         int result = 0;
//         if(bobArrival < aliceArrival){
//             if(Integer.valueOf(arriveAlice.substring(0 , 2)) == Integer.valueOf(leaveAlice.substring(0 , 2))){
//                 result = Integer.valueOf(leaveAlice.substring(3)) - Integer.valueOf(arriveAlice.substring(3)) + 1;
//             }else{
//                 int arrivalMonth = Integer.valueOf(arriveAlice.substring(0 , 2));
//                 int arrayMonth = months[arrivalMonth - 1];
//                 int stayedDays = arrayMonth - Integer.valueOf(arriveAlice.substring(3));
//                 int departureMonth = Integer.valueOf(leaveAlice.substring(0 , 2));
//                 arrayMonth = months[departureMonth - 1];
//                 int leaveDays = arrayMonth - Integer.valueOf(leaveAlice.substring(3));
//                 result = stayedDays + leaveDays;
//             }
//         }else{
//             if(Integer.valueOf(arriveBob.substring(0 , 2)) == Integer.valueOf(leaveAlice.substring(0 , 2))){
//                 result = Integer.valueOf(leaveAlice.substring(3)) - Integer.valueOf(arriveBob.substring(3)) + 1;
//             }else{
//                 int arrivalMonth = Integer.valueOf(arriveBob.substring(0 , 2));
//                 int arrayMonth = months[arrivalMonth - 1];
//                 int stayedDays = arrayMonth - Integer.valueOf(arriveBob.substring(3));
//                 int departureMonth = Integer.valueOf(leaveAlice.substring(0 , 2));
//                 arrayMonth = months[departureMonth - 1];
//                 int leaveDays = arrayMonth - Integer.valueOf(leaveAlice.substring(3));
//                 result = stayedDays + leaveDays;   
//             }
//         }
//         return result;
//     }
// }
import java.time.LocalDate;
class Solution {

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob){
        LocalDate d1 = LocalDate.of(2021,Integer.parseInt(arriveAlice.substring(0,2)),Integer.parseInt(arriveAlice.substring(3,5)));
        LocalDate d2 = LocalDate.of(2021,Integer.parseInt(leaveAlice.substring(0,2)),Integer.parseInt(leaveAlice.substring(3,5)));
        LocalDate d3 = LocalDate.of(2021,Integer.parseInt(arriveBob.substring(0,2)),Integer.parseInt(arriveBob.substring(3,5)));
        LocalDate d4 = LocalDate.of(2021,Integer.parseInt(leaveBob.substring(0,2)),Integer.parseInt(leaveBob.substring(3,5)));
        long aa = d1.toEpochDay(); //Alice Arrive
        long al = d2.toEpochDay(); //Alice Left
        long ba = d3.toEpochDay(); //Bob Arrive
        long bl = d4.toEpochDay(); //Bob Left
        if(al<ba || bl<aa) return 0; //No intersection of days
        return (int) ((Math.min(al,bl)-Math.max(aa,ba))+1); //Intersection of days
    }
}