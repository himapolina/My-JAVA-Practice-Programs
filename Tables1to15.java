//Write a Java program to print multiplication Table (1 to 15).
class Tables1to15{
    public static void main(String[] arg){
        int i=1, j=1;
        for(i=1;i<=15;i++){
            for(j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
    }
}