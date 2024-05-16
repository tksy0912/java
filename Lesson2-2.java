class Main {
  public static void main(String[] args) {

    // 配列
    // 変数namesに、配列を代入
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    // インデックス番号で出力（結果はにんじゃんわんこ）
    System.out.println(names[0]);


    // 要素の上書き
    String[] languages = {"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);
    // インデックス番号が「1」の要素を上書き
    languages[1] = "Java";
    System.out.println(languages[1]);


    // for文での繰り返し
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    // names.lengthで自動的に要素の数を数えてくれる
    for (int i = 0; i < names.length; i++) {
      System.out.println("私の名前は" + names[i] + "です");
    }


    // 拡張for文：配列用の特別な構文
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    for (String name : names) {
      System.out.println("私の名前は" + name + "です");
    }


    // 配列の奇数の和と偶数の和をそれぞれ求め、その結果を表示
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    for (int number : numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}