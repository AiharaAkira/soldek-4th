import java.util.ArrayList;

public class CMain2 {

	public static void main(String[] args) {


		//List 域伸 : 亜痕 紫戚綜 壕伸 - 亜舌 弦戚 紫遂
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(33.1);
		al.add("せ");
		
		System.out.println(al.size());
		System.out.println("-----------------------");
		
		//<適掘什誤> : generic >> 汽戚斗 展脊聖 悪薦馬澗 依.
		
		ArrayList<String> al12 = new ArrayList<String>();
		al12.add("zzz");
		al12.add("けけけ");
		al12.add("せせせ");
		System.out.println(al12.size());
		
		System.out.println(al12.get(1));
		
		for (String s : al12) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		al12.add("ぞ"); //情薦窮走 蓄亜
		al12.add(0, "ぞ"); // 是帖 走舛 亜管
		al12.set(1, "せさせ"); // 汽戚斗 葵 痕井 亜管
		al12.remove(3); //汽戚斗 葵 肢薦 亜管 
		
		
		for(int i = 0; i < al12.size(); i++) {
			System.out.println(al12.get(i));
		}
		System.out.println("------------------------");
		// al3 幻級嬢辞 10, 20 隔壱 陥 窒径
		// 設 照床澗 莫殿 x
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		
		al3.add(10);
		al3.add(20);
		
		for (Integer integer : al3) {
			System.out.println(integer);
		}
		
	}

}
