package com.bbs.common.base;


import com.bbs.common.dto.BBSResult;
import com.bbs.common.exception.ServiceProcessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected BBSResult restProcessor(ResultProcessor processor){
        BBSResult result = null;
        try{
            result = processor.process();
        }
        catch (ServiceProcessException e1){
            logger.error("ServiceProcess Error Log :"+e1.getLocalizedMessage(),e1);
            result = BBSResult.error(e1.getMessage());
        }
        catch (Exception e){
            logger.error("Error Log :"+e.getLocalizedMessage(),e);
            result = BBSResult.error("服务器出现异常");
        }

        return result;
    }
}
