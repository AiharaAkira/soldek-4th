// Conditional Stmt(繕闇庚)
// 繕闇庚 (if)

//if(繕闇縦){
//繕闇戚 凧析凶 叔楳 吃 庚舌}
public class CDMain1 {

	public static void main(String[] args) {
		
//		if庚, else(却掻馬蟹. 限劃 焼艦劃)
		int age = 70;
		
		//蟹戚亜 70戚雌戚檎 "照括馬淑艦猿"窒径, 焼艦檎 "嬢軒獣革推" 窒径
		if(age >= 70) {
			System.out.println("照括馬淑艦猿");
		}else {
			System.out.println("嬢軒獣革推.");
		}
		
		
		String msg = age >= 70 ? "照括馬淑艦猿" : "嬢軒獣革推";
		System.out.println(msg);
		
		//蟹戚亜 筈呪 10詞耕幻, "せせせ" 焼艦檎 "ぞぞぞ"
		
		int age2 = 3;
		if(age2 %2 ==1 && age2 < 10) {
			System.out.println("筈呪戚檎辞 10詞 耕幻");
		}else {
			System.out.println("Else");
		}
		
		//蟹戚亜 1詞 段引 5詞 耕幻戚檎 "ぞさぞ" 窒径
		if(age2 > 1 && age2 < 5) {
			System.out.println("1詞 段引 5詞耕幻");
		}
		
		//失昔 焼戚 疑舘転渋
		//是拭 痕呪 age(70), age2(3)
		
		int height = 100;
		
		//age 亜 20詞 角生悟, age2亜 3詞戚雌戚壱, 徹亜 80角生檎 
		//疑鋼転渋 亜管 < 窒径
		//繕闇 照限生檎 疑鋼転渋 災亜 < 窒径
		
		if(age > 20 || age2 >= 30 && height > 180) {
			System.out.println("疑鋼転渋 亜管");
		}else {
			System.out.println("疑鋼転渋 災亜");
		}
		
		/*
		 * t || t && t == t
		 * t || t && f == t
		 * t || f && t == t
		 * t || f && f == t
		 * && 亜酔識授是 株製 == 胡煽 床食像
		 * 
		 */
		
		
		
	}

}
