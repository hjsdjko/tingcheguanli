package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchejiluEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 停车记录 服务类
 */
public interface TingchejiluService extends IService<TingchejiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}