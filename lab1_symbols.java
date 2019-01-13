/*Ëàáîðàòîðíàÿ ðàáîòà ¹1
 *Çàäàíèå: ïîäñ÷åò óíèêàëüíûõ ñèìâîëîâ â ñòðîêå, êîòîðàÿ ââîäèòñÿ ñ êëàâèàòóðû, è èõ âûâîä â ôîðìå: ñèìâîë - êîëè÷åñòâî
 *Âûïîëíèëà: Ãîíàøåâñêàÿ Ç.Ì., ãð. ÈÂÒ-173
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter you text : ");
        text=in.next();
        String t="";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (t.indexOf(text.charAt(i))==-1) t+=text.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (t.charAt(i) == text.charAt(j)) count++;
            }
            System.out.println(t.charAt(i) + " " + count);
        }
    }
}
