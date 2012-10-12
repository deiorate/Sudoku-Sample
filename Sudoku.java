public class Sudoku {
	public static void main (String args[]) {
		for(int i=0;i < args.length; i++){
			String input[] = args[i].split(",");
			if(input.length == 16) {
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			int d = Integer.parseInt(input[3]);
			System.out.println("\n" + input[0] + "  " + input[1] + "  " + input[2] + "  " + input[3]);
			
			int aa = Integer.parseInt(input[4]);
			int bb = Integer.parseInt(input[5]);
			int cc = Integer.parseInt(input[6]);
			int dd = Integer.parseInt(input[7]);
			System.out.println(input[4] + "  " + input[5] + "  " + input[6] + "  " + input[7]);
			
			int aaa = Integer.parseInt(input[8]);
			int bbb = Integer.parseInt(input[9]);
			int ccc = Integer.parseInt(input[10]);
			int ddd = Integer.parseInt(input[11]);
			System.out.println(input[8] + "  " + input[9] + "  " + input[10] + "  " + input[11]);
			
			int aaaa = Integer.parseInt(input[12]);
			int bbbb = Integer.parseInt(input[13]);
			int cccc = Integer.parseInt(input[14]);
			int dddd = Integer.parseInt(input[15]);
			System.out.println(input[12] + "  " + input[13] + "  " + input[14] + "  " + input[15] + "\n");
			
			System.out.println("1st row: 	"+ (a + b + c + d));
			System.out.println("1st column: 	"+ (a + aa + aaa + aaaa));
			System.out.println("2nd row: 	"+ (aa + bb + cc + dd));
			System.out.println("2nd column: 	"+ (b + bb + bbb + bbbb));
			System.out.println("3rd row: 	"+ (aaa + bbb + ccc + ddd));
			System.out.println("3rd column: 	"+(c + cc + ccc + cccc));
			System.out.println("4th row: 	"+(aaaa + bbbb + cccc + dddd));
			System.out.println("4th column: 	"+(d + dd + ddd + dddd));
			
				if ((a + b + c + d) == (a + aa + aaa + aaaa) &&
					(aa + bb + cc + dd) == (b + bb + bbb + bbbb) &&
					(aaa + bbb + ccc + ddd) == (c + cc + ccc + cccc) &&
					(aaaa + bbbb + cccc + dddd) == (d + dd + ddd + dddd)) {
					System.out.println("you win!");
				} else {
					System.out.println("you lose!");
				}
			} else {
				System.out.println(input.length);
				System.out.println("invalid input");
			}
		}
	}
}