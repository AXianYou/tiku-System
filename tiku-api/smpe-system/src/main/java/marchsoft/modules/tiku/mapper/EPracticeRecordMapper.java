package marchsoft.modules.tiku.mapper;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import marchsoft.modules.tiku.entity.EPracticeRecord;
import marchsoft.base.BasicMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* <p>
* 题库练习记录 Mapper 接口
* </p>
*
* @author mfei
* @since 2022-03-29
*/
@Component
public interface EPracticeRecordMapper extends BasicMapper<EPracticeRecord> {


    @Select("SELECT * FROM e_practice_record WHERE user_id = #{userId} AND safe_type_id = #{safeTypeId} AND is_deleted = 0")
    List<EPracticeRecord> getByUserIdAndSafeTypeId(Long userId, Long safeTypeId);
}
