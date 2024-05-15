class Main {
  public static void main(String[] args) {
    System.out.println("Hello Java");
    // "文字列"
    // ()の中を出力せよ、という命令
    // javaは文末に;が必須


    // int型の変数
    int number;
    number = 3;
    System.out.println(number);

    // String型の変数
    String name;
    name = "Wanko";
    System.out.println(name);


    // 変数の初期化
    int number1 = 3;
    int number2 = 7;
    System.out.println(number1 + number2);
    // 「10」が出力

    String text = "プログラミングを勉強しよう";
    System.out.println("Progateで" + text);
    // 「Progateでプログラミングを勉強しよう」が出力


    // 変数の上書き
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);

    number = 9;
    System.out.println(number);

    text = "Java";
    System.out.println(text);


    // 変数の自己代入
    int number = 3;
    System.out.println(number);

    number = number + 7;
    System.out.println(number);
  }
}