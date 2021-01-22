package notes;
import java.util.*;
public class note3 {

	public static void main(String[] args) {


				// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
				HashMap<String, String> dic = new HashMap<String, String>();

				// 3 개의 (key, value) 쌍을 dic에 저장
				dic.put("baby", "아기"); // "baby"는 key, "아기"은 value
				dic.put("love", "사랑");
				dic.put("apple", "사과");

				// dic 해시맵에 들어 있는 모든 (key, value) 쌍 출력
				Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				while(it.hasNext()) {
					String key = it.next(); // 키
					String value = dic.get(key); // 값
					System.out.print("(" + key + "," + value + ")");
				}
			System.out.println();		

	}

}
