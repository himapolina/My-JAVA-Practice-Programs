class Grading{
    public static void main(String[] arg){
        char[][] arr= new char[8][10];
        //char because answers are a,b,c or d.
        char[] key=new char[]{'a','c','d','b','c','c','a','d','d','b'};
        computeResults(arr, key);
    }
    static void computeResults(char[][] arr, char[] key){
        for(int i=0; i<8; i++){
            int count=0;
            for(int j=0;j<10;j++){
                if(arr[i][j]==key[j]) count+=1;
            }
            System.out.println("The marks of student "+(i+1)+" = "+count);
        }
    }
}