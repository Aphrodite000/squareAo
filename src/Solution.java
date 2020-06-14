import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int n=Integer.parseInt(str[0]);
        char[] ch=str[1].toCharArray();
        char a=ch[0];
        if(n%2==1){ //奇数
            for(int i=1;i<=n;i++){
                if(i==1||i==n){
                    for(int j=0;j<n;j++){
                        System.out.print(a);
                    }
                }else if(i%2==0){
                    System.out.println();
                }else{
                    for(int j=1;j<n;j++){
                        if(j==1||j==n-1){
                            System.out.print(a);
                        }
                        System.out.print(" ");
                    }
                    //System.out.println();
                }
            }
        }else{
            for(int i=1;i<=n-1;i++){
                if(i==1||i==n-1){
                    for(int j=0;j<n;j++){
                        System.out.print(a);
                    }
                    if(i==n-1){
                        System.out.println();
                    }
                }else if(i%2==0){
                    System.out.println();
                }else{
                    for(int j=1;j<n;j++){
                        if(j==1||j==n-1){
                            System.out.print(a);
                        }
                        System.out.print(" ");
                    }
                    //System.out.println();
                }
            }
        }
    }
}
