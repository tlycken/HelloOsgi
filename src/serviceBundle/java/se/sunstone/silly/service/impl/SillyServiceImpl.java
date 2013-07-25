package se.sunstone.silly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import se.sunstone.silly.service.SillyService;

public class SillyServiceImpl implements SillyService {

    private static Log logger = LogFactory.getLog(SillyServiceImpl.class);

    @Override
    public String getSillyMessage() {
        return "Ministry of Silly Talks";
    }

    public void startService() {
        logger.info(String.format("%s as implementation of %s is starting.",
                SillyServiceImpl.class.getName(), SillyService.class.getName()));
    }

}
