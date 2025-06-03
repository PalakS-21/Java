package JavaTraining;

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("helloo");

//         try{
//             Thread.sleep(3000);
//         }
//         catch(Exception e){
//         }

//         System.out.println("hii");
//     }
// }

// public class MultithreadingExample {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
//         // for(int i=0;i<=5;i++){
//         // System.out.println("hiiii");
//         // }
//     }
// }

// class downloadFile{
//     public static void file(String file) {
//         for (int i = 1; i<=5; i++){
//             System.out.println(file + " downloading..." + (i*20) + "%");
//         }
//         try{
//             Thread.sleep(2000);
//         }
//         catch(Exception e){
//         }
//         System.out.println(file + "done");
//     }
// }
// public class MultithreadingExample {
//     public static void main(String[] args) {
//         downloadFile obj = new downloadFile();
//         obj.file("file A ");
//         obj.file("file B ");
//     }
// }

//parallel downloading
class DownloadFile extends Thread{
    private String file;

public DownloadFile(String file){
    this.file = file;
}
public void run(){
   for(int i = 1; i <= 5; i++){
    System.out.println(file +  " downloading..." + (i*20) + "%");
    try{
        Thread.sleep(2000);
    }
    catch(Exception e){}
}
System.out.println(file + "Donee");
}

}
public class MultithreadingExample {
   public static void main(String[] args) {
    DownloadFile d1 =  new DownloadFile("file A ");
    DownloadFile d2 = new DownloadFile("file B ");
    d1.start();
    d2.start();
    }
}

