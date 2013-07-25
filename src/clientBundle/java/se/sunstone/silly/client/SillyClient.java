package se.sunstone.silly.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import se.sunstone.silly.service.SillyService;

public class SillyClient {

    private static Log logger = LogFactory.getLog(SillyClient.class);
    private SillyService _svc;

    public void setSillyService(SillyService svc) {
        _svc = svc;
    }

    public SillyService getSillyService() {
        return _svc;
    }

    public void printSillyMessage() {
        logger.info(String.format("Todays silly message is '%s'", _svc.getSillyMessage()));
    }

    public void startClient() {
        logger.info("Starting client...");
        printSillyMessage();
    }
}
