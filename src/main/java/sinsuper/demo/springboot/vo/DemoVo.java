package sinsuper.demo.springboot.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class DemoVo {
	
	private Long memberNo;
	
	@NonNull
	private String id;
	
	private String name;
}
