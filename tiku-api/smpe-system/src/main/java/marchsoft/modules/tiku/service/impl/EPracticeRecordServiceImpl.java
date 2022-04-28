package marchsoft.modules.tiku.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import marchsoft.modules.tiku.entity.EPracticeRecord;
import marchsoft.modules.tiku.mapper.EPracticeRecordMapper;
import marchsoft.modules.tiku.service.IEPracticeRecordService;
import marchsoft.base.BasicServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import marchsoft.utils.CacheKey;
import marchsoft.utils.RedisUtils;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

/**
* <p>
* 题库练习记录 服务实现类
* </p>
*
* @author mfei
* @since 2022-03-29
*/
@Service
@RequiredArgsConstructor
public class EPracticeRecordServiceImpl extends BasicServiceImpl<EPracticeRecordMapper, EPracticeRecord> implements IEPracticeRecordService {

//    private final EPracticeRecordMapper ePracticeRecordMapper;
//    private final RedisUtils redisUtils;
//
//    @Override
//    public List<EPracticeRecord> getEPracticeRecordByIdForRedis(Long id) {
//        List<EPracticeRecord> ePracticeRecordList = new ArrayList<>();
//        Map<String,Object> ePracticeRecordRedis = new HashMap<>();
//        String key = CacheKey.PRACTICERECORD + id;
//
//        if (redisUtils.hasKey(key)){
//            ePracticeRecordRedis = (Map<String,Object>) (Object) redisUtils.hmget(key);
//            Set<String> keySet = ePracticeRecordRedis.keySet();
//            for (Object keyRepoId : keySet){
//                EPracticeRecord ePracticeRecord = new EPracticeRecord();
//                ePracticeRecord.setId(id);
//                ePracticeRecord.setFinishRepoIds((String) keyRepoId);
//                ePracticeRecord.setFinishQuesAnswer((String) ePracticeRecordRedis.get(keyRepoId));
//                ePracticeRecordList.add(ePracticeRecord);
//
//            }
//            return ePracticeRecordList;
//        }
//
//        // 若redis过期，则练习记录已经入库
//        EPracticeRecord ePracticeRecord = ePracticeRecordMapper.selectById(id);
//        if (ObjectUtil.isNotNull(ePracticeRecord)){
//            String repoIdsString = ePracticeRecord.getFinishRepoIds();
//            String answersString = ePracticeRecord.getFinishQuesAnswer();
//            if (StrUtil.isNotBlank(repoIdsString) && StrUtil.isNotBlank(answersString)){
//                String[] repoIds = repoIdsString.split(",");
//                String[] answers = answersString.split(",");
//                for (int i = 0; i < repoIds.length; i++) {
//                    EPracticeRecord ePracticeRecord1 = new EPracticeRecord();
//
//                    ePracticeRecordRedis.put(repoIds[i],answers[i]);
//                    ePracticeRecord1.setFinishRepoIds(repoIds[i]);
//                    ePracticeRecord1.setFinishQuesAnswer(answers[i]);
//                    ePracticeRecordList.add(ePracticeRecord1);
//                }
//                // 放入缓存中
//                redisUtils.hmset(key,ePracticeRecordRedis);
//            }
//        }
//        return ePracticeRecordList;
//    }
//
//    @Override
//    public void addPracticeRecord(EPracticeRecord ePracticeRecord) {
//        Long practiceRecordId = ePracticeRecord.getId();
//        String key = CacheKey.PRACTICERECORD + practiceRecordId;
//        long time = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2L)).getSeconds();
////  key为练习记录id   map中的key为题目id  value为答案
//        String answer = ePracticeRecord.getFinishQuesAnswer();
//        String repoId = ePracticeRecord.getFinishRepoIds();
//
//        if (!redisUtils.hasKey(key)){
//            // 没有key  则以入库 或第一次添加
//            //进行初始化
//            this.getEPracticeRecordByIdForRedis(practiceRecordId);
//        }
//
//        redisUtils.hset(key,repoId,answer,time);
//    }


}

