package sinsuper.demo.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sinsuper.demo.springboot.mapper.DemoMapper;
import sinsuper.demo.springboot.vo.DemoVo;

@Service
public class DemoService {
	
	@Autowired
	public DemoMapper demoMapper;
	
	public List<DemoVo> selectDemo(){
		return demoMapper.selectDemo();
	}
}
