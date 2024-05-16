class Main {
  public static void main(String[] args) {
    
    // 真偽値と比較演算子
    // 「true」を用いて、「真」を表す真偽値を出力
    System.out.println(true);
    
    // 「false」を用いて、「偽」を表す真偽値を出力
    System.out.println(false);
    
    // 「==」を用いて、値を比較した結果を出力
    System.out.println(12/4 == 3);
    
    // 「!=」を用いて、値を比較した結果を出力
    System.out.println(12/4 != 3);
    
    // 変数を定義し、値を比較した結果を代入
    boolean bool = 3*9 == 27;
    // 変数boolの値を出力
    System.out.println(bool);
    
    
    // 論理演算子
    // trueと出力
    System.out.println(true || false);
    
    // falseと出力
    System.out.println(false && true);
    
    // 「8 < 5」かつ「3 >= 2」の結果を出力
    System.out.println(8 < 5 && 3 >= 2);
    
    // 「8 < 5」または「3 >= 2」の結果を出力
    System.out.println(8 < 5 || 3 >= 2);
    
    // 「8 < 5」でない、の結果を出力
    System.out.println(!(8 < 5));
    
    
    // 条件分岐（if文）
    // 条件式に直接trueを入れる
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    // 条件式に直接falseを入れる
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }
    
    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力
    if (x > 8) {
      System.out.println("xは8より大きい");
    }
    
    
    // else、else if
    int number = 12;
    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }
    
    
    // switch文
    int n = 1;
    switch (n) {
      case 1 :
        System.out.println("大吉です");
        break;
      case 2 :
        System.out.println("吉です");
        break;
    }
  }
}