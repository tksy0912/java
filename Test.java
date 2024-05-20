// 1〜10までの数字のうち偶数のみを昇順で表示させる
public class Main {
	public static void main(String[] args) {
	  // 1,変数の初期化(昇順なので、10からスタート)
	  // 2,条件式(iが1以上)
	  // 3,変数の更新(-1を繰り返す)
		for (int i = 10; i >= 1; i--) {
		  // 偶数の場合に表示
		  // 奇数の場合は「i % 2 != 0」
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}


// 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
public class Test1 {
	public static void main(String[] args) {
	  // 変数定義
		int counts = 0;
	  // 1,変数の初期化
	  // 2,条件式(iが10以下)
	  // 3,変数の更新(+1を繰り返す)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
			  // 偶数の場合の数を数える
				counts++;
			}
		}
	System.out.println("1～10までの偶数の数は" + counts);
	}
}

// 1〜10までの整数をカンマ区切りで横並びで表示させる(10にはカンマをつけない)
public class Test2 {
	public static void main(String[] args) {
	  // 1,変数の初期化
	  // 2,条件式(iが10以下)
	  // 3,変数の更新(+1を繰り返す)
	  for (int i = 1; i <= 10; i++) {
	    // 「print」にすることで、横並びになる
	    System.out.print(i);
	      // iが10ではない時は、「,」を付ける
	      if (i != 10) {
	        System.out.print(",");
	      }
	  }
	}
}


//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
public class Test3 {
	public static void main(String[] args) {
	  // 要素数20の配列(0～19)を宣言
		int[] num = new int[20];
		// 配列の要素に0から5ずつ加算して代入
		// lengthは要素の数を数える機能(i < 20　と同じ意味)
		for (int i = 0; i < num.length; i++) {
			num[i] = i * 5;
		}
		
		// [0]～[10]の奇数の値をカンマ区切りで表示
		System.out.print("奇数：");
		for (int i = 0; i <= 10; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i]);
				if (i < 10-1) {
					System.out.print(",");
				}
			}
		}
		// ↓の記述がないと、以下[11]～[19]の偶数の値をカンマ区切りで表示が改行されない
		System.out.println();
		
		// [11]～[19]の偶数の値をカンマ区切りで表示
		System.out.print("偶数：");
		for (int i = 11; i <= 19; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i]);
				if (i < 19-1) {
					System.out.print(",");
				}
			}
		}
	}
}