package marchsoft.modules.tiku.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marchsoft.modules.tiku.entity.EPracticeRecord;
import marchsoft.modules.tiku.entity.ERepository;
import marchsoft.modules.tiku.service.IEPracticeRecordService;
import marchsoft.response.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* <p>
* 题库练习记录 前端控制器
* </p>
* @author mfei
* @since 2022-03-29
*/
@RequiredArgsConstructor
@RestController
@Slf4j
@Api(tags = "题库练习记录模块")
@RequestMapping("/api/ePracticeRecord")
public class EPracticeRecordController {

//    private final IEPracticeRecordService ePracticeRecordService;
//
//
//    @ApiOperation(value = "根据练习记录id进行查询练习记录")
//    @GetMapping(value = "/getEPracticeRecordById")
//    public Result<List<EPracticeRecord>> getEPracticeRecord(Long id){
//        return Result.success(ePracticeRecordService.getEPracticeRecordByIdForRedis(id));
//    }
//
//
//    @ApiOperation(value = "添加练习记录")
//    @PostMapping
//    public Result<Void> insertEPracticeRecord(@RequestBody EPracticeRecord ePracticeRecord){
//        ePracticeRecordService.addPracticeRecord(ePracticeRecord);
//        return Result.success();
//    }


}
