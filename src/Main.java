import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Nhập chuỗi (nhập chuỗi rỗng để kết thúc):");
            String str = scanner.nextLine();

            if(str.isEmpty()){
                break;
            }

            int count = 0;
            for(int i = 0; i < str.length(); i++){

                char ch = str.charAt(i);

                if(ch >= 'A' && ch <= 'Z'){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
