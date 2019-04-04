import com.baidupanapi.*;
public class Test {

	public static void main(String[] args) throws Exception {
		
		String username = "awrymqy";
		String password = "11111110";
		//BaseClass basic = new BaseClass(username, password, null, null);
		BaiduPanService service = new BaiduPanService(username, password, null);
		//service.quota(null);
		service.listFiles("/2", null, null, null, null, null);
		//service.getThumbnail("/2/fe5594209ab28b2c68e4f021437e2d23.jpg", null, null, null, null);
		
	}
	
}
