package pkg;

public class CVMath {
    public static int findMid(int one, int two, int three)
    {
        return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
    }

    //returns true if value is Perfect square
    public static void specialSquare(int amount){
        int c = 0;
        int num = 1;
        int find = 0;
        boolean perfect;
        
        while(c < amount){
            find = (int)(Math.sqrt(num));
            if(find*find == num){
                int addUp = 0;
                for(int cc = 0; addUp < num; cc++){
                    addUp = addUp + cc;
                    if(addUp == num){
                        System.out.println(num);
                        c++;
                        break;
                    }
                }
                
            }
            num++;
        }
    }
}