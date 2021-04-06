// java 課題制作2　星座占い ※提出用

import java.util.*;

public class Seiza {
	public static void main (String[] args) {

		String[] seiza = {"やぎ座", "みずがめ座", "うお座", "おひつじ座",
		                  "おうし座", "ふたご座", "かに座", "しし座", "おとめ座", "てんびん座",
		                  "さそり座", "いて座"
		                 };

		System.out.println("星座占いへようこそ");
		System.out.println("あなたの星座は？ 下記から選んで入力してください");
		System.out.println("");

		String[] unsei = {"ラッキーアイテム：赤いTシャツ", "ラッキーナンバー：5",
		                  "ラッキースポット：公園", "少し疲れ気味なので、今日は早く寝ましょう",
		                  "何をやってもうまくいきます、自信をもって！",
		                  "いらない一言で相手を傷つけるかも、十分注意して！",
		                  "身近な人にサプライズプレゼントをしてみましょう", "新しいことにチャレンジしてみましょう",
		                  "お酒の飲みすぎに気を付けて！"
		                 };

		System.out.println(Arrays.toString(seiza));//配列の中身を文字列で表示

		Scanner stdIn = new Scanner(System.in);
		String input = stdIn.nextLine();//自分の星座を入力


		Random rand = new Random();
		int n = rand.nextInt(8);//unsei要素をランダムにして変数nに代入
		System.out.println(unsei[n]);//変数nをランダムに表示
	}

}

