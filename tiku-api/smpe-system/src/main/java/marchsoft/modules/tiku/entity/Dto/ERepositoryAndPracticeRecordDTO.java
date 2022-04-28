package marchsoft.modules.tiku.entity.Dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import marchsoft.base.BaseDTO;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zhoubo
 * @Date: 2022/4/21 14:26
 * @Version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ERepositoryAndPracticeRecordDTO extends BaseDTO implements Serializable {
    /**
     *功能描述:
     *   题库
     * @param null null
     * @return null
     * @author zhoubo
     * @date 2022/4/21
    */
    List<RepositoryDto> repositoryDtos;

    /**
     *功能描述:
     *   联系记录id
     * @param null null
     * @return null
     * @author zhoubo
     * @date 2022/4/21
    */
         private Long practiceRecordId;
}


