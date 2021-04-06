// java 課題制作1 席替えプログラム
import java.util.*;

public class Sekigae {
	public static void main (String[] args) {

		System.out.println("席替えを開始します");
		System.out.println("1. はい  2. いいえ");
		Scanner stdIn = new Scanner(System.in);

		int num = stdIn.nextInt();//1.はい OR 2.いいえを選ぶ

		if (num == 1) {

			List<String> list = Arrays.asList("O", "P", "Q", "R", "S", "T",
			                                  "U", "V", "W", "X", "Y", "Z",
			                                  "A", "B", "C", "D");
			List<String> shuffled = new ArrayList<String> (list);

			Collections.shuffle(shuffled);//要素をシャッフル

			System.out.println(shuffled);//繰り返し表示
		} else {
			return;
		}
	}
}