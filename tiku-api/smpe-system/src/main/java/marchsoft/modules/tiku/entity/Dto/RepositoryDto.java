package marchsoft.modules.tiku.entity.Dto;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import marchsoft.modules.tiku.entity.ERepository;

import java.io.Serializable;

@Data
public class RepositoryDto implements Serializable {

    private Long safeTypeId;

    private Integer quesType;

    private String quesContent;

    private String options;

    private String answer;

    /**
     *功能描述:
     *   分支名称
     * @param null null
     * @return null
     * @author zhoubo
     * @date 2022/4/21
    */
    private String name;
}
