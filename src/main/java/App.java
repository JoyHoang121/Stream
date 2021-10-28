import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        try {
//            //tạo tập tin
//            FileOutputStream fos = new FileOutputStream("data.txt", true); //true là ghi thêm thông tin
//            PrintWriter writer = new PrintWriter(fos);
//            //ghi dữ liệu vào tập tin text
//            writer.println("1/5");
//
//            writer.flush();
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Đọc nội dung từ tập tin lên
//        try {
//            FileInputStream fos = new FileInputStream("data.txt");
//            InputStreamReader isr = new InputStreamReader(fos);
//            BufferedReader reader = new BufferedReader(isr);
//            String line = null;
//            do {
//                line = reader.readLine();
//                System.out.println(line);
//            } while (line!=null);
//
//            reader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Sử dụng scanner để đọc file
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Viết chương trình java ghép nội dung 2 tập tin text sang tập tin khác
        // thông tin của 3 tập tin sẽ được nhập bởi user
        

    }
}
