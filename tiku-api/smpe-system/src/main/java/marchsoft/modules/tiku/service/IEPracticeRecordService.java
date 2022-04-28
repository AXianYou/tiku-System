package marchsoft.modules.tiku.service;

import marchsoft.modules.tiku.entity.EPracticeRecord;
import marchsoft.base.IBasicService;

import java.util.List;

/**
 * <p>
 * 题库练习记录 服务类
 * </p>
 *
 * @author mfei
 * @since 2022-03-29
 */
public interface IEPracticeRecordService extends IBasicService<EPracticeRecord> {

//    // 通过id 查找redis中的练习记录
//    List<EPracticeRecord> getEPracticeRecordByIdForRedis(Long id);
//
//    // 通过用户点击下一题，将上一题的记录存入缓存
//    void addPracticeRecord(EPracticeRecord ePracticeRecord);
}
