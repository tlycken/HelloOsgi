package se.sunstone.silly.bundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

    private static Log logger = LogFactory.getLog(Activator.class);

    @Override
    public void start(BundleContext context) throws Exception {
        ServiceReference[] refs = context.getAllServiceReferences(
                null, null);

        if (refs != null) {
            logger.info(String.format("There are %s references", refs.length));
        } else {
            logger.info("There are no references - refs==null!");
        }

        for (ServiceReference ref : refs) {
            logger.info(String.format("\t%s", ref.toString()));
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        // TODO Auto-generated method stub

    }

}
