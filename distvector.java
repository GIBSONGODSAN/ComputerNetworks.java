import java.util.*;

public class distvector{
    public static void main(String[] args)
    {
        int n,i,j,k;
        int[][] adj = new int[10][10];
        int[][] rou_tab=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Nodes: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the value of ["+i+"] ["+j+"]");
                adj[i][j]=sc.nextInt();
            } }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                rou_tab[i][j]=adj[i][j];
            } }
        // Bellman Ford Algorithm
        for(k=0;k<n;k++){
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if (rou_tab[i][j] > rou_tab[i][k] + rou_tab[k][j]) {
                        rou_tab[i][j] = rou_tab[i][k] + rou_tab[k][j];
                    } 
                } 
            } 
        } 
        System.out.println("\nDistance Vector Table After Iteration " + k + ":");
        for(int g=0;g<n;g++){
            for(int f=0;f<n;f++){
                    System.out.println("The value of ["+g+"] ["+f+"] is :"+rou_tab[g][f]);
            }
        }
    }
}