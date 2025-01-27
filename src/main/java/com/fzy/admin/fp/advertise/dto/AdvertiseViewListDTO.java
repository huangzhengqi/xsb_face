package com.fzy.admin.fp.advertise.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fzy.admin.fp.common.spring.pagination.PageVo;
import com.fzy.admin.fp.common.validation.annotation.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author huxiangqiang
 * @date 2019/7/15 19:51
 * @Description 添加广告 入参
 */
@Data
public class AdvertiseViewListDTO extends PageVo {


    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "生效时间不能为空")
    @ApiModelProperty(value = "生效时间")
    private Date beginTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "结束时间不能为空")
    @ApiModelProperty(value = "结束时间")
    private Date endTime;

    @ApiModelProperty(value = "状态 1曝光 2点击")
    private Integer status;

    @ApiModelProperty(value = "广告id")
    private String id;




}
