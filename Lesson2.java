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
    
  }
}