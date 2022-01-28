import java.io.*;
class FileReadWords{
    public static void main(String[] arg){
        BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
        
        while (true) {
        String line  = r.readLine();
        String[] arr= line.split(" ");
        System.out.println(line);
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    }
}