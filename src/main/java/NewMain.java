/*  �� ������� ������� - ������ ��������� � ����
**  
**  ��� �������� ��� ���������������� ����� �� ��������.
**  
**
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ���
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        HashMap<String,String> nameInfo = new HashMap<>();
        
        ArrayList<String> phones = new ArrayList<>();
        
        phones.add("+8 800 2000 500 +8 800 200 600");
        phones.add("+8 800 2000 700" );
        phones.add("+8 800 2000 800 +8 800 2000 900 +8 800 2000 000");
                       
        Scanner scan = new Scanner(System.in); 
        //���������������� ����. ������ �����(���)
        String inKey; // ��� ����� ���
        System.out.print("������� ���: ");
        inKey = scan.nextLine();
        
        if (nameInfo.containsValue(inKey) != false){
            System.out.println("\""+ inKey +"\"" + "� ���� ������ �� ������." );
        }
        nameInfo.put("Ivanov I.I.", phones.get(0));
        nameInfo.put("Petrov P.P.", phones.get(1));
        nameInfo.put("Sidorov S.S.", phones.get(2));
        
        System.out.println(inKey);
        Pattern p = Pattern.compile("[+]"); //����������� �����������
        
        Scanner scan1;        
        scan1 = new Scanner(nameInfo.get(inKey)).useDelimiter(p);
       
        String number="0";
        
        int i=0;
        while(!"-1".equals(number)){
            if (scan1.hasNextLine()){ // �������� �����
                i++;
                System.out.println(i + "." + "+" + scan1.next());   
            }
            else break;
        }
        System.out.println("������� ����������");    
    }    
}