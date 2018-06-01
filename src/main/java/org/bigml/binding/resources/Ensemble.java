package org.bigml.binding.resources;

import org.bigml.binding.utils.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point to create, retrieve, list, update, and delete ensembles.
 *
 * Full API documentation on the API can be found from BigML at:
 * https://bigml.com/api/ensembles
 *
 *
 */
public class Ensemble extends AbstractModelResource {

    // Logging
    Logger logger = LoggerFactory.getLogger(Ensemble.class);

    /**
     * Constructor
     *
     */
    public Ensemble() {
    	super.init(null, null, null);
        this.resourceRe = ENSEMBLE_RE;
        this.resourceUrl = ENSEMBLE_URL;
        this.resourceName = "ensemble";
    }

    /**
     * Constructor
     *
     */
    public Ensemble(final String apiUser, final String apiKey) {
    	super.init(apiUser, apiKey, null);
        this.resourceRe = ENSEMBLE_RE;
        this.resourceUrl = ENSEMBLE_URL;
        this.resourceName = "ensemble";
    }

    /**
     * Constructor
     *
     */
    public Ensemble(final String apiUser, final String apiKey, final CacheManager cacheManager) {
    	super.init(apiUser, apiKey, cacheManager);
        this.resourceRe = ENSEMBLE_RE;
        this.resourceUrl = ENSEMBLE_URL;
        this.resourceName = "ensemble";
    }

}