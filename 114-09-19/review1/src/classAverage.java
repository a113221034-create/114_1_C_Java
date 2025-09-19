import java.util.Scanner;

public class classAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total=0;//總分
        int gradeCounter=0;//成績計算器

        System.out.print("輸入完成請按ctrl-z結束輸入");

        while(input.hasNext()){
            if(input.hasNextInt()){
                int grade = input.nextInt();//讀取成績
                total+=grade;//加總成績
                gradeCounter++;//成績計數器加1
            } else {
                System.out.println("輸入錯誤，請輸入整數成績！");
                input.next(); // 跳過錯誤輸入
            }
        }

        if (gradeCounter!=0){
            double average = (double) total/gradeCounter;//計算平均
            System.out.printf("總分為%d\n",total);
            System.out.printf("成績數為%d\n",gradeCounter);
            System.out.printf("平均為%.2f\n",average);
        }else {
            System.out.println("沒有輸入成績");
        }
    }
}
