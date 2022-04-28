package marchsoft.modules.tiku.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import marchsoft.modules.tiku.entity.Dto.RepositoryDto;
import marchsoft.modules.tiku.entity.ERepository;
import marchsoft.base.BasicMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
* <p>
* 题库 Mapper 接口
* </p>
*s
* @author mfei
* @since 2022-03-29
*/
@Component
public interface ERepositoryMapper extends BasicMapper<ERepository> {


    //  条件查询
    @Select("SELECT * FROM e_repository ${ew.customSqlSegment}")
    IPage<ERepository> getAll(IPage<ERepository> page, @Param(Constants.WRAPPER) LambdaQueryWrapper<ERepository> criteria);

    @Select("SELECT * FROM e_repository_ ${ew.customSqlSegment}")
    IPage<RepositoryDto> selectRepositoryPage(IPage<RepositoryDto> page,@Param(Constants.WRAPPER) LambdaQueryWrapper<ERepository> queryWrapper);
}
