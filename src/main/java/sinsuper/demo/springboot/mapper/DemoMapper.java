package sinsuper.demo.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import sinsuper.demo.springboot.vo.DemoVo;

@Repository
@Mapper
public interface DemoMapper {
	List<DemoVo> selectDemo();
}
